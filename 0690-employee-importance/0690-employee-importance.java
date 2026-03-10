/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map=new HashMap<>();
        for(Employee e : employees){
            map.put(e.id,e);
        }
        Queue<Employee> q=new LinkedList<>();
        int total=0;
        q.offer(map.get(id));
        while(!q.isEmpty()){
            Employee curr=q.poll();
            total+=curr.importance;
            for(int sub : curr.subordinates){
                q.offer(map.get(sub));
            }

        }
        return total;

    }
}