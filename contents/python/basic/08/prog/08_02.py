class Circle:

    def area(self):
        area = int(self.r)*int(self.r)*3.14
        return area

    def circuit(self):
        circuit = 2*int(self.r)*3.14
        return circuit

    def inputRadius(self):
        print('半径の値を入力してください。')
        self.r = input()

class Zukei:
    def main(self):
        r=0
        p1 = Circle()
        p1.inputRadius()
        print('面積は、' + str(p1.area()) + 'です。')
        print('円周は、' + str(p1.circuit()) + 'です。')
p2=Zukei()
p2.main()
