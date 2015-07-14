YEARS = [
    ('earth', 31557600),
    ('mercury', 0.2408467),
    ('venus', 0.61519726),
    ('mars', 1.8808158),
    ('jupiter', 11.862615),
    ('saturn', 29.447498),
    ('uranus', 84.016846),
    ('neptune', 164.79132)
]


class SpaceAge(object):
    def __init__(self, age_in_seconds):
        self.age_in_seconds = age_in_seconds
        self.__create_methods()

    @property
    def seconds(self):
        return self.age_in_seconds

    def __create_methods(self):
        for planet, year in YEARS:
            setattr(self, 'on_' + planet, 0)

