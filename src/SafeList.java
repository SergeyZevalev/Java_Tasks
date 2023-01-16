import java.util.*;

public class SafeList<E> implements List<E> {

    private final List<E> list;

    public SafeList(List<E> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public boolean add(E o) {
        if (o == null) return false;
        if (list.contains(o)) return false;
        return list.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean addAll(Collection<?extends E> c) {
        for (E e: c){
            add(e);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        for (E e: c){
            add(index, e);
        }
        return true;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public E get(int index) {
        if (isEmpty() || index >= size() || index < 0) return null;
        else return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        if (isEmpty() || index >= size() || index < 0 || element == null || list.contains(element)) return null;
        else return list.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        if (element != null && !list.contains(element) && index < size() && index > 0) list.add(index, element);
    }

    @Override
    public E remove(int index) {
        if (index > 0 && index < size()) return list.remove(index);
        else return null;
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        if (fromIndex > 0 && toIndex > 0 && fromIndex < size() && toIndex < size()) return list.subList(fromIndex, toIndex);
        return Collections.emptyList();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public <E> E[] toArray(E[] a) {
        return list.toArray(a);
    }
}
