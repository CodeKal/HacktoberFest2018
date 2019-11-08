#Girdi alalım
a = int(input("1.sayı: "))

# "%" operatörü bir sayısının diğer sayıya bölümünden kalan sonucu verir.
if a%2==0:
   print(a,"sayısı çifttir.")
else:
   print(a, "sayısı tektir.")

#GÖREV:Yukarıda verilen örenğin benzerini üçe bölünebilme ile yapınız:
#!!!Python programlama dilinde boşluklar programın çalışması için önem arz etmektedir.
#Yukarıdaki örneği baz alarak görevi yerine getirebilirsiniz.

b = int(input("Pozitif Bir Tam Sayı Giriniz:"))
if b%3==0:
   print(b, "3 ile tam bölünür ve tektir")

elif: b%3==1:
   print(b, "3 ile tam bölünmez ve çifttir")
else:
   print(b, "3 ile tam bölünmez ve tektir")
