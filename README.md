server.port=8888

<h1>İstekler</h1>
Merkezi Mecidiyeköy' de bulunan araştırma şirketi "Anket A.Ş.":

Sahadan gelen anket formalarını raporlamak konusunda sıkıntı yaşamaktadır.

Bunun sonucunda maliyetler artmakta, oluşan ek süreden dolayı şirketin çevikliği azalmakta ve girişlerde oluşan hatalardan dolayı araştırmaların doğruluk payları azalmaktadır.

 

"Anket A.Ş." nin bizden talebi:

 

    • Anketçilerin var olan anketlerden birini seçmeleri, doldurmaları ve kaydetmeleri.

   

    • Kaydedilen formların bir tabloda (listede)

        o  Görüntülenmesi

        o  Güncellenebilmesi

        o  Silinebilmesi

              

    • (Opsiyonel) istatistik alanlarının ana ekranda görüntülenmesi:

        o Mutluluk oranı >>> örneğin: %78

        o Tutulan takımların yüzdesel dağılımı >>> örneğin: %35 Fenerbahçe, % 33 Galatasaray…

     

Firma başlangıç olarak aşağıdaki formların yeterli olacağını söyledi:

         

    --------------------------------

    Uygulama Adı: Anket Toplama Merkezi

    --------------------------------

 

 

        Anket Adı: Tuttuğunuz Futbol Takımı

        --------------------

            Ankete katılanın:

                Adı: String

                Soyadı: String

                Cinsiyeti: (int)

                Doğum Tarihi: Datetime

                ***(istatistik alanı) Tuttuğu Takım: String

                Açıklaması: String

            Anketörün:

                Adı: String

                Soyadı: String

        ---------------------------

 

 

        Anket Adı: Hayatınızdan Memnun musunuz?:

        ---------------------------

            Ankete katılanın:

                Adı: String

                Soyadı: String

                Cinsiyeti: (int)

                Doğum Tarihi: Datetime

                ***(istatistik alanı) Mutluluk Oranı: (int, 1 den 10 a kadar değer)

                Sizi en mutlu eden şeyler: String

                Sizi en mutsuz eden şeyler: String

                Açıklaması: String

            Anketörün:

                Adı: String

                Soyadı: String
