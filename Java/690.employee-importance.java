import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 */
/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee e : employees) {
            map.put(e.id, e);
        }
        if(!map.containsKey(id)) return 0;
        Queue<Employee> queue = new LinkedList<>();
        int importance = 0;
        queue.offer(map.get(id));
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; ++i) {
                Employee e = queue.poll();
                importance += e.importance;
                for(int sub : e.subordinates) {
                    queue.offer(map.get(sub));
                }
            }
        }
        return importance;
    }
}

