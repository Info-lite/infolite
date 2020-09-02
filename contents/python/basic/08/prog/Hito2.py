class Person:
    def main(self):
        name = 'なまえ'
        age = 20

    def show(self):
        print('名前は、' + self.name + 'です。')
        print('年齢は、' + str(self.age) + '歳です。')

    def getage(self):
        return self.age

p1 = Person()
p1.main()





