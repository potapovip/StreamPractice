
public class StreamPractice {
    public static void main(String[] args) {


//        Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), давайте посмотрим как её можно
//        обрабатывать используя методы filter, findFirst, findAny, skip и count:


//        Вернуть количество вхождений объекта «a1»

//        Вернуть первый элемент коллекции или 0, если коллекция пуста

//        Вернуть последний элемент коллекции или «empty», если коллекция пуста

//        Найти элемент в коллекции равный «a3» или кинуть ошибку

//        Вернуть третий элемент коллекции по порядку

//        Вернуть два элемента начиная со второго

//        Выбрать все элементы содержащие "1" и поместить их в List
//            -------------------------------------------------------------------------------------------------------

//        Условие: дана коллекция класс People (с полями name — имя,  age — возраст, sex — пол), вида Arrays.asList(
//        new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN), new
//        People(«Иван Иванович», 69, Sex.MAN)). Давайте посмотрим примеры как работать с таким классом:


//        Выбрать мужчин-военнообязанных (от 18 до 27 лет)

//        Найти средний возраст среди мужчин

//        Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в
//        55 лет, а мужчина в 60)

//            -------------------------------------------------------------------------------------------------------
//        Рассмотрим результаты работы над коллекцией Collection ordered = Arrays.asList(«a1», «a2», «a2», «a3»,
//        «a1», «a2», «a2») и Collection nonOrdered = new HashSet<>(ordered).


//        Получение коллекции без дубликатов из неупорядоченного стрима

//        Получение коллекции без дубликатов из упорядоченного стрима
//            -------------------------------------------------------------------------------------------------------


//        Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), давайте посмотрим, как её можно
//        обрабатывать используя Match функции


//        Найти существуют ли хоть один «a1» элемент в коллекции

//        Найти существуют ли хоть один «a8» элемент в коллекции

//        Найти есть ли символ «1» у всех элементов коллекции

//        Проверить что не существуют ни одного «a7» элемента в коллекции
//            -------------------------------------------------------------------------------------------------------

//        Условие: даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1») и collection2 = Arrays
//        .asList(«1,2,0», «4,5»), давайте посмотрим как её можно обрабатывать используя различные map функции

//        Добавить "_1" к каждому элементу первой коллекции

//        В первой коллекции убрать первый символ и вернуть массив чисел (int[])

//        Из второй коллекции получить все числа, перечисленные через запятую из всех элементов

//        Из второй коллекции получить сумму всех чисел, перечисленных через запятую

//            -------------------------------------------------------------------------------------------------------

//        Условие: даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4») и коллекция
//        людей класса People (с полями name — имя, age — возраст, sex — пол), вида Arrays.asList( new People(«Вася»,
//        16, Sex.MAN), new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN), new People(«Иван
//        Иванович», 69, Sex.MAN)). Давайте посмотрим примеры как их можно сортировать:

//        Отсортировать коллекцию строк по алфавиту

//        Отсортировать коллекцию строк по алфавиту в обратном порядке

//        Отсортировать коллекцию строк по алфавиту и убрать дубликаты

//        Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты

//        Отсортировать коллекцию людей по имени в обратном алфавитном порядке

//        Отсортировать коллекцию людей сначала по полу, а потом по возрасту
//            -------------------------------------------------------------------------------------------------------

//        Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), и коллекция класса Peoples из прошлых
//        примеров про Sorted и Filter функции.

//        Найти максимальное значение среди коллекции строк

//        Найти минимальное значение среди коллекции строк

//        Найдем человека с максимальным возрастом

//        Найдем человека с минимальным возрастом
//            -------------------------------------------------------------------------------------------------------

//        Условие: Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2) выполним над ними несколько действий используя reduce.

//        Получить сумму чисел или вернуть 0

//        Вернуть максимум или -1

//        Вернуть сумму нечетных чисел или 0
//            -------------------------------------------------------------------------------------------------------

//        Условие: Дана коллекция чисел Arrays.asList(1, 2, 3, 4), рассмотрим работу collect и toArray с ней

//        Получить сумму нечетных чисел

//        Вычесть от каждого элемента 1 и получить среднее

//        Прибавить к числам 3 и получить статистику

//        Разделить числа на четные и нечетные
//            -------------------------------------------------------------------------------------------------------

//        Условие: Дана коллекция строк Arrays.asList(«a1», «b2», «c3», «a1»), рассмотрим работу collect и toArray с ней

//        Получение списка без дубликатов

//        Получить массив строк без дубликатов и в верхнем регистре

//        Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b>

//        Преобразовать в map, где первый символ ключ, второй символ значение

//        Преобразовать в map, сгруппировав по первому символу строки

//        Преобразовать в map, сгруппировав по первому символу строки и объединим вторые символы через :

    }
}
