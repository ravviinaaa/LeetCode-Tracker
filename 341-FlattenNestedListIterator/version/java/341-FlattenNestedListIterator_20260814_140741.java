// Last updated: 8/14/2026, 2:07:41 PM
1public class NestedIterator implements Iterator<Integer> {
2
3    public NestedIterator(List<NestedInteger> nestedList) {
4        lists = new Stack<>();
5        lists.push(nestedList.listIterator());
6    }
7
8    public Integer next() {
9        hasNext();
10        return lists.peek().next().getInteger();
11    }
12
13    public boolean hasNext() {
14        while (!lists.empty()) {
15            if (!lists.peek().hasNext()) {
16                lists.pop();
17            } else {
18                NestedInteger x = lists.peek().next();
19                if (x.isInteger())
20                    return lists.peek().previous() == x;
21                lists.push(x.getList().listIterator());
22            }
23        }
24        return false;
25    }
26    
27    private Stack<ListIterator<NestedInteger>> lists;
28}