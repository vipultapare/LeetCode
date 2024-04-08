class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
       

        Stack<Integer>st = new Stack<>();

        for(int i = 0 ;i<sandwiches.length ; i++)
        {
            list2.add(sandwiches[i]);
            list.add(students[i]);
        }
        
        while(  list.size()>0 && list.contains(list2.get(0)))
        {
            int curr = list.get(0);
            list.remove(0);
            if(curr == list2.get(0))
            {
                list2.remove(0);
            }
            else
            {
                list.add(curr);
            }
        }

        return list.isEmpty() ? 0 : list.size();
}
}