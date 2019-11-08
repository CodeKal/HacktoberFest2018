#İsminizi ve yaşınızı girdiğinizde size merhaba deyip hangi yılda 100 yaşınıza gireceğinizi söyleyen bir program yapın.
isim = input("İsim: ")
yas = int(input("Yaş: "))
yüzyas = 2119 - yas
print("Merhaba {}, {} yılında 100 yaşına gireceksin!".format(isim, yüzyas))
