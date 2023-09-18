
/* Дополнительная информация часто представлена в виде атрибутов
        * и методов внутри классов, а также модификаторов доступа
        * и аннотаций. Вот пример кода на Java, который включает эти элементы:
        * В этом примере дополнительная информация включает:
        *
        * Видимость: Модификаторы public, protected, и private показывают уровень доступа к атрибутам и методам.
        * Статические методы: staticMethod является статическим методом класса Student.
        * Финальные атрибуты: В классе CollegeStudent, collegeName является финальным атрибутом.
        * Аннотации: Используется аннотация @Override для переопределения метода toString.
        * Эти детали также можно визуализировать на UML-диаграмме
        * для более полного понимания структуры кода. */

package additionalInformation;

// Класс с различными видами атрибутов и методов
public class Student {
    // Видимость и атрибуты (Visibility and Attributes)
    private String name;  // Приватный атрибут
    public int age;       // Публичный атрибут
    protected String id;  // Защищенный атрибут

    // Конструктор (Constructor)
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Публичный метод (Public Method)
    public void study() {
        System.out.println("Studying...");
    }

    // Защищенный метод (Protected Method)
    protected void takeExam() {
        System.out.println("Taking exam...");
    }

    // Приватный метод (Private Method)
    private void sleep() {
        System.out.println("Sleeping...");
    }

    // Статический метод (Static Method)
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Аннотация (Annotation)
    @Override
    public String toString() {
        return "Student: " + name;
    }
}
