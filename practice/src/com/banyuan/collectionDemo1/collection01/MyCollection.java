package com.banyuan.collectionDemo1.collection01;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection implements Collection{
    private Object obj[];
    static int index=0;
        @Override
        public int size() {
            return obj.length;
        }

        @Override
        public boolean isEmpty() {
            if(obj==null){
                return true;
            }else
                return false;
        }

        @Override
        public boolean contains(Object o) {
            for(int i=0;i<obj.length;i++) {
                if(obj[i]==o)
                    return true;
            }
            return false;
        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }

        @Override
        public boolean add(Object o) {
            int a=index++;
            Object []ob=new Object[a];
            System.arraycopy(obj,0,ob,0,a);
            ob[a-1]=o;
            obj=ob;
            return true;
        }

        @Override
        public boolean remove(Object o) {
            Object []ob=new Object[obj.length-1];
            for(int i=0;i<obj.length;i++){
                if(obj[i]==o){
                    System.arraycopy(obj,0,ob,0,i);
                    System.arraycopy(obj,i+1,ob,i,obj.length-1-i);
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }

        @Override
        public boolean addAll(Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
             return false;
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public void clear() {

        }
}
