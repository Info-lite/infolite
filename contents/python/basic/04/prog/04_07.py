junishi = ['子', '丑', '寅', '卯', '辰', '巳', '午', '未', '申', '酉', '戌', '亥']

year = int(input("Please input year: "))

print(junishi[(year % 12) - 4])
