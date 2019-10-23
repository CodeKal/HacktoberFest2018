# Her Türlü Ardışık Dizinin Terimleri Toplamını Veren Program şerefsiz gökçe

a = input("İlk Terim:")
b = input("Son Terim:")
c = input("Ardışık İki Terimin Farkı:")

sonuç = (((int(a) + int(b)) * (int(b) - int(a) + int(c))) / (2 * int(c)))

print("Sonuç:", int(sonuç))

# Her Türlü Ardışık Dizinin Terimleri Toplamını Veren Program

a = input("İlk Terim:")
b = input("Son Terim:")
c = input("Artış Miktarı:")

sonuç = (((int(b) + int(a)) * (int(b) - int(a) + int(c))) / (2 * int(c)))

print("Sonuç:", int(sonuç))
