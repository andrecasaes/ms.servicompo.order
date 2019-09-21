using System;
using System.Collections.Generic;
using System.Linq.Expressions;

public interface IRepository<T> where T : class
{
    T GetByid(int id);
    IEnumerable<T> GetAll();
    IEnumerable<T> Find(Expression<Func<T,bool>> predicate);
    void add(T entity);
    void addRange(IEnumerable<T> entities);
    void Remove(T entity);
    void RemoveRange(IEnumerable<T> entities);
    
}