# Question7

Write a web app with using Spring Boot,there will be User registration with fields "name" , "surname" and "address" and you will display these informantions in a grid.Also we could do UPDATE,DELETE,CREATE,READ operations in grid.

#Açıklama 

Spring Boot Nedir?

Spring Boot, Spring tabanlı uygulama geliştirmenin en hızlı ve kolay yolu olması amacıyla geliştirilmiş bir frameworktür. Spring Boot sayesinde boilerplate yani basmakalıp kodlardan sıyrılıp, sadece ihtiyacımız olan kodu yazıyoruz (only write code that you need to). Spring Boot web sunucusu olarak Tomcat ve diğer birçok ek  özellikle beraber geliyor.

Spring Boot’un sağladığı en büyük avantajlardan biri ise sizi herhangi bir XML konfigürasyonuyla uğraşmak zorunda bırakmaması.

Uygulama Gereksinimleri ve POM Dosyası

Spring Boot ile yazacağımız uygulamamız,
Kullanıcı adı, soyadı ve adresi alınmıştır ve üye kaydı sağlanmıştır. Sonra da tablodaki tüm üye listeleri gösterilmiştir. Gösterilen üyelerde bilgilerin düzenlenmesi ve üye silme işlevselliği kazandırılmıştır.

ihtiyaç duyacağımız kütüphaneleri kullanabilmek için gerekli dependencyleri pom.xml dosyasına eklenmiştir.


#Not

#Proje Maven ile hazırlanmıştır.
Proje indirildikten sonra IDE'ye maven projesi olarak import edilip maven clean ve install komutları çalıştırılmalıdır. Gerekirse maven update yapılmalıdır. En son Application class'ı run edilmelidir.

Proje çalışınca browserdan; 
http://localhost:8080/  adresinden CRUD işlemlerine başlayabilirsiniz.


