# Question7

Write a web app with using Spring Boot,there will be User registration with fields "name" , "surname" and "address" and you will display these informantions in a grid.Also we could do UPDATE,DELETE,CREATE,READ operations in grid.

#Açıklama 

Spring Boot Nedir?

Spring Boot, Spring tabanlı uygulama geliştirmenin en hızlı ve kolay yolu olması amacıyla geliştirilmiş bir frameworktür. Spring Boot sayesinde boilerplate yani basmakalıp kodlardan sıyrılıp, sadece ihtiyacımız olan kodu yazıyoruz (only write code that you need to). Spring Boot web sunucusu olarak Tomcat ve diğer birçok ek  özellikle beraber geliyor.

Spring Boot’un sağladığı en büyük avantajlardan biri ise sizi herhangi bir XML konfigürasyonuyla uğraşmak zorunda bırakmaması.

Uygulama Gereksinimleri ve POM Dosyası

Spring Boot ile yazacağımız uygulamamız,
Kullanıcı adı, soyadı ve adresi alınmıştır ve üye kaydı sağlanmıştır. Sonra da tablodaki tüm üye listeleri gösterilmiştir. Gösterilen üyelerde bilgilerin düzenlenmesi ve üye silme işlevselliği kazandırılmıştır.

Proje de MySQL workbench de veritabanı hazırlanmıştır. Hazırlanan veritabanının ismi userdb dir. İstenildiği taktirde resources/application.properties dosyasından veritabanı ismi değiştirilebilir. Bu dosyada mysql ve hibernate konfigürasyonları bulunmaktadır. 

Hibernate konfigürasyonu kullanılarak veritabanında tablonun oluşması kolaylaştırılmıştır. Aynı zamanda tablo içinde Column ların içi sql kodlarının karşmaşıklığından kurtulup Hibernate orm mantığıyla rahatlıkla doldurulmuştur.

resources/application.propertie dosyasında " spring.jpa.properties.hibernate.hbm2ddl.auto: update " özelliği ile tablolar oluşturulmuş ve daha sonra yapılan kayıtlar tablo içine doldurulmuştur.

ihtiyaç duyacağımız kütüphaneleri kullanabilmek için gerekli dependencyleri pom.xml dosyasına eklenmiştir.


#Not

#ORM nedir?

ORM, Object Relational Mapping anlamına gelmektedir.  O/R Mapping olarakta yazılabilir.  ORM nedir diye bir soru soracak olursak şöyle bir cevap verebiliriz: “İlişkisel veritabanı (RDBMS) ile nesneye yönelik programlanın (OO) arasında bir tür köprü özelliği gören ve ilişkisel veritabanındaki bilgilerimizi yönetmek için, nesne modellerimizi kullandığımız bir tekniktir/metodtur”. Basite indirgemek istersek: “Nesnelerimizi ilişkisel veritabanındaki tablomuza bağlayan ve veri alış-verişini bizim için yapan bir tekniktir/metodtur”. ORM tekniği belli bir programlama diline bağlı değildir ve her OO dilinde yazılabilir/kullanılabilir.

#Proje Maven ile hazırlanmıştır.
Proje indirildikten sonra IDE'ye maven projesi olarak import edilip maven clean ve install komutları çalıştırılmalıdır. Gerekirse maven update yapılmalıdır. En son Application class'ı run edilmelidir.

Proje çalıştırılınca browserdan; 
http://localhost:8080/  adresinden CRUD işlemlerine başlayabilirsiniz.


