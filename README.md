# JavaInDepth
- **Access Modifiers**
*   **public**: Bir sınıf, değişken veya metotun herhangi bir yerden erişilebilir olduğunu belirtmek için kullanılır. Yani, `public` olarak işaretlenen bir sınıf, değişken veya metot, diğer sınıflardan erişilebilir.
*   **private**: Bir değişken veya metotun sadece tanımlandığı sınıf içinde erişilebilir olduğunu belirtmek için kullanılır. Yani, `private` olarak işaretlenen bir değişken veya metot, sadece aynı sınıf içinde kullanılabilir ve dışarıdan erişilemez.
*   **protected**: Bir değişken veya metotun, tanımlandığı sınıfta ve bu sınıfı genişleten alt sınıflarda erişilebilir olduğunu belirtmek için kullanılır. Yani, `protected` olarak işaretlenen bir değişken veya metot, aynı sınıf ve alt sınıflar tarafından erişilebilir, ancak diğer sınıflardan erişilemez.
*   **default (package-private)**: Eğer bir değişken veya metotun herhangi bir erişim belirleyicisi belirtilmemişse, varsayılan olarak `default` erişim belirleyicisi atanır. Bu durumda, değişken veya metot sadece aynı paket içindeki diğer sınıflardan erişilebilir, fakat farklı bir paketten gelen sınıflar erişemez.
*   **final**: Bir değişkenin veya sınıfın değiştirilemez olduğunu belirtmek için kullanılır. `final` olarak işaretlenen bir değişkenin değeri değiştirilemez, bir metot `final` olarak işaretlenirse alt sınıflar tarafından yeniden tanımlanamaz ve bir sınıf `final` olarak işaretlenirse bu sınıfın alt sınıfları olamaz.

- Collections
    - 
    - List: List && ArrayList
      -  ArrayList, bir dizinin boyutunu dinamik olarak genişletebilir veya küçültebilir, böylece dizinin boyutunu önceden belirtmek gerekmez.
      - ArrayList, dizideki öğelere hızlı bir şekilde erişim sağlar çünkü bir diziyi kullanır, bu nedenle rastgele erişim hızlıdır. Ancak, bir öğeyi eklemek veya çıkarmak için dizinin ortasında veya başında değişiklik yapmak performans açısından maliyetli olabilir.
      - 'List' bir arayüzü temsil ederken 'ArrayList' bu arayüzü uygular ve dinamik bir dizi sağlar. 
    - Map: Map & HashMap (Sırayla erişme yerine key ile erişme olanağı sağlıyor.)
    - Set : Sıra kavramı yok. Aynı elemanı birden fazla oluşturmanın önüne geçip belleğin şişmesinin önüne geçiyor.
    - Queue : Elemanları sırayla koyup sırayla almamızı sağlar.
- Composition (Nesne Bileşimleri)
  - Relation (has-a) 1x1, 1xN, NxN
  - Association (Veri tabanlarında kullanılan sistem)
  - Composition (Bir nesnenin içine başka bir nesneyi koyuyoruz.)
- Inheritance: Extends
  - Code duplication
  - instanceof: Bir nesnenin belirtilen bir sınıfın örneği olup olmadığını kontrol etmek için kullanılır.
  - Java'da inheritance bir is-a relationship'dir. Yani yalnızca iki class arasında is-a relationship varsa inheritance kullanabiliriz.
  - super keyword, subclass methodundan superclass methodunu çağırmak için kullanılır.
  - subclass, superclass'ın daha özellşmiş hali olmalıdır yani kalıtım yaparken bir hiyerarşiden söz etmemiz gereklidir.
  - Java'da bir class, sadece bir tane superclass'dan miras alabilir ancak birden fazla interface uygulayabilir(çoklu interface).
- Overriding: @Overrides
- Abstract class (Soyut sınıf) : Diğer sınıflar tarafından genişletilmesi gereken ve kendisi doğrudan bir nesne oluşturulamayan bir sınıftır. Abstract classlar genellikle ortak davranışları ve özellikleri içeren sınıflar için kullanılır.
- Abstract method
- Polymorphism (Çok biçimlilik)
- Encapsulation: 
  - getter and setter -> Access specifier
  - Instance variable'lar private tanımlanmalıdır.
- Single inheritance
- Multipe inheritance
- Interface: Bir sınıfın sahip olabileceği davranışları tanımlayan bir yapıdır. Bir interface, sınıflar arasında bir tür sözleşme sağlar ve bir sınıfın belirli bir davranış setini sağlamasını garanti eder. Interface'ler genellikle bir sınıfın sahip olabileceği metodları tanımlar, ancak bu metodlar için herhangi bir kod içermez, yalnızca imzaları (isimleri, parametreleri ve dönüş türü) belirtirler. Sınıflar, bir interface'i implements anahtar kelimesiyle uygulayarak, interface'in tanımladığı tüm metodları sağlamak zorundadır. Bu şekilde, Java'da çoklu kalıtımı sağlayarak bir sınıfın birden fazla interface'i uygulamasına olanak tanır
- Polymorphism
- Specification
  - 
- Implementation