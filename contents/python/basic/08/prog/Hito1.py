class Person:
    def main(self):
        self.name = '都立大'
        self.age = 20

    def show(self):
        print('名前は、' + self.name + 'です。')
        print('年齢は、' + str(self.age) + '歳です。')

p1 = Person()
p1.main()
p1.show()




