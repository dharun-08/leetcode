//how to convert a list to integer array
 int primitive[] = list.stream().mapToInt(Integer::intValue).toArray();
