public class Generics {
    // return the number of occurrence
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 6, 9, 3, 5, 9, 3, 5, 42, null};
        String[] names = {"Jon", "Arya", "Dany", "Tyrion", "Jon"};
        System.out.println(countOccurrences(nums, 3));
        System.out.println(countOccurrences(names, "Jon"));
    }
    // 泛型的好处是可以实现代码复用，并且在编译阶段就检查类型是否一致
    public static <T> int countOccurrences(T[] array, T item) {
        int count = 0;
        if (item == null) {
            for (T arrayItem : array){
                count = arrayItem == item ? count + 1 : count;
            }
        } else {
            for (T arrayItem : array){
                count = item.equals(arrayItem) ? count + 1 : count;
            }
        }
        return count;
    }
}
