package test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Administrator on 25.12.2015.
 */
public class test02Maps implements Map<Integer, Integer>
{
    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public boolean containsKey(Object o)
    {
        return false;
    }

    @Override
    public boolean containsValue(Object o)
    {
        return false;
    }

    @Override
    public Integer get(Object o)
    {
        return null;
    }

    @Override
    public Integer put(Integer integer, Integer integer2)
    {
        return null;
    }

    @Override
    public Integer remove(Object o)
    {
        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Integer> map)
    {

    }

    @Override
    public void clear()
    {

    }

    @Override
    public Set<Integer> keySet()
    {
        return null;
    }

    @Override
    public Collection<Integer> values()
    {
        return null;
    }

    @Override
    public Set<Entry<Integer, Integer>> entrySet()
    {
        return null;
    }

    @Override
    public Integer getOrDefault(Object o, Integer integer)
    {
        return null;
    }

    @Override
    public void forEach(BiConsumer<? super Integer, ? super Integer> biConsumer)
    {

    }

    @Override
    public void replaceAll(BiFunction<? super Integer, ? super Integer, ? extends Integer> biFunction)
    {

    }

    @Override
    public Integer putIfAbsent(Integer integer, Integer integer2)
    {
        return null;
    }

    @Override
    public boolean remove(Object o, Object o1)
    {
        return false;
    }

    @Override
    public boolean replace(Integer integer, Integer integer2, Integer v1)
    {
        return false;
    }

    @Override
    public Integer replace(Integer integer, Integer integer2)
    {
        return null;
    }

    @Override
    public Integer computeIfAbsent(Integer integer, Function<? super Integer, ? extends Integer> function)
    {
        return null;
    }

    @Override
    public Integer computeIfPresent(Integer integer, BiFunction<? super Integer, ? super Integer, ? extends Integer> biFunction)
    {
        return null;
    }

    @Override
    public Integer compute(Integer integer, BiFunction<? super Integer, ? super Integer, ? extends Integer> biFunction)
    {
        return null;
    }

    @Override
    public Integer merge(Integer integer, Integer integer2, BiFunction<? super Integer, ? super Integer, ? extends Integer> biFunction)
    {
        return null;
    }
}
