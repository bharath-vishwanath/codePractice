void main() {
    System.out.println(areAnagrams("asdada asdasd asdasd", "saddda adasdasd asdads"));
}
public static boolean areAnagrams(String s1, String s2){

    System.out.println(Arrays.stream(s1.split(" ")).map(a -> (a.substring(0,1).toUpperCase() + a.substring(1))).collect(Collectors.joining(" ")));

    System.out.println(Arrays.stream(s2.split("\\s+"))
            .map(a -> a.substring(0,1).toUpperCase() + a.substring(1)).collect(Collectors.joining(" ")));
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a,b);
}

