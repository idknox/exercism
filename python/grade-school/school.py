class School(object):
    def __init__(self, name):
        self.name = name
        self.db = {}

    def add(self, name, grade):
        if grade not in self.db:
            self.db[grade] = set()

        self.db[grade].add(name)

    def grade(self, number):
        return self.db.get(number, set())

    def sort(self):
        return [(grade, tuple(students)) for grade, students in self.db.items()]