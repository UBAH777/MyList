package com.company;

import java.util.Collection;
import java.util.Iterator;

public class MyList<T> implements Collection<T> {
    // MyList это класс списка
    class Node<T> {                                // Node это класс-поле Списка, представляет элемент списка
        private T value;
        private Node <T> next;

        public Node(T value) {                     // конструктор элемента
            this.value = value;                    // value это значение элемента, next - ссылка на след элемент
            this.next = null;                      // null означает ничего но не ноль
        }

        public T getValue() {                      //
            return value;
        }

        public Node<T> getNext() {                 //
            return next;
        }

        public void setNext(Node<T> next) {        //
            this.next = next;
        }

        public String toString() {                 // перевод значения в строку
            return value.toString();
        }

        public boolean hasNext() {                 // узнаём, есть ли у элемента ссылка на следующий (чтобы найти последний)
            return (this.next != null);
        }
    }

    Node<T> begin;                                 // "первый" элемент
    long length;                                   // длина списка
    private Comparable comparable;

    public MyList(Comparable compare) {                              // конструктор списка
        this.begin = null;
        this.length = 0;
        this.comparable = compare;
    }


    public Node<T> end() {
        if (this.begin == null)
            return null;

        Node<T> iter = this.begin;                    // делаем итератор-ссылку на "условно первый" элемент
        while (iter.hasNext()) {                   // проходим по всем ссылкам, пока не найдем последний элемент(т.к. ему не на что ссылаться, т.е. на null)
            iter = iter.getNext();
        }
        return iter;                               // возвращаем итератор, содержащий последнюю ссылку
    }

    public String toString() {
        String result = "[ ";
        if (this.begin != null) {
            Node<T> iter = this.begin;
            while (iter.hasNext()) {
                result += iter.getValue() + ", ";
                iter = iter.getNext();
            }
            result += iter.getValue() + " ";
        }
        result += "]";
        return result;
    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (this.begin == null) {                  // если элементов нет
            this.begin = new Node<T>(t);
        }
        else {
            this.end().setNext(new Node<T>(t));   // если елементов больше 1, то находим ссылку на последний элем(т.е. end()) и создаем для него новый элем,
        }                                          // которому присвоим значение value, а в Node первоупоянутого запишем(установим) ссылку на новый(т.е. setNext())
        this.length++;                             // после добавления увеличим длину на 1
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

}
