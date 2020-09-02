class Person:
    def main(self):
        self.name = '都立大'
        self.age = 20

    def show(self):
        print('名前は、' + self.name + 'です。')
        print('年齢は、' + str(self.age) + '歳です。')

    def getage(self):
        return self.age

    def future_age(self, year):
        self.age += year
        print(year, '年後の年齢は、', self.age, '歳です。')

p1 = Person()
p1.name = 'なまえ'
p1.age = 20
p1.show()
p1.future_age(5)


