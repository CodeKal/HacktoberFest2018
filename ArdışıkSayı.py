a = input("İlk Terim:") 
b = input("Son Terim:") 
c = input("Artış Miktarı:") 
sonuç = (((int(b) + int(a)) * (int(b) - int(a) + int(c))) / (2 * int(c))) 
print("Sonuç:", int(sonuç)) 
