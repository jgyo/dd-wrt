/* DirContext.java --
   Copyright (C) 2001 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package javax.naming.directory;

import javax.naming.*;

/**
 * @author Warren Levy <warrenl@redhat.com>
 * @date June 13, 2001
 */

public interface DirContext extends Context
{
  public static final int ADD_ATTRIBUTE = 1;
  public static final int REPLACE_ATTRIBUTE = 2;
  public static final int REMOVE_ATTRIBUTE = 3;

  public Attributes getAttributes (String name) throws NamingException;
  public Attributes getAttributes (String name, String[] attrIds) throws NamingException;
  public Attributes getAttributes (Name name) throws NamingException;
  public Attributes getAttributes(Name name, String[] attrIds) throws NamingException;
  public void modifyAttributes(Name name, int mod_op, Attributes attrs) throws NamingException;
  public void modifyAttributes(String name, int mod_op, Attributes attrs) throws NamingException;
  public void modifyAttributes(Name name, ModificationItem[] mods) throws NamingException;
  public void modifyAttributes(String name, ModificationItem[] mods) throws NamingException;
  public void bind(Name name, Object obj, Attributes attrs) throws NamingException;
  public void bind(String name, Object obj, Attributes attrs) throws NamingException;
  public void rebind(Name name, Object obj, Attributes attrs) throws NamingException;
  public void rebind(String name, Object obj, Attributes attrs) throws NamingException;
  public DirContext createSubcontext(Name name, Attributes attrs) throws NamingException;
  public DirContext createSubcontext(String name, Attributes attrs) throws NamingException;
  public DirContext getSchema(Name name) throws NamingException;
  public DirContext getSchema(String name) throws NamingException;
  public DirContext getSchemaClassDefinition(Name name) throws NamingException;
  public DirContext getSchemaClassDefinition(String name) throws NamingException;
  public NamingEnumeration search(Name name, Attributes matchingAttributes, String[] attributesToReturn) throws NamingException;
  public NamingEnumeration search(String name, Attributes matchingAttributes, String[] attributesToReturn) throws NamingException;
  public NamingEnumeration search(Name name, Attributes matchingAttributes) throws NamingException;
  public NamingEnumeration search(String name, Attributes matchingAttributes) throws NamingException;
  public NamingEnumeration search(Name name, String filter, SearchControls cons) throws NamingException;
  public NamingEnumeration search(String name, String filter, SearchControls cons) throws NamingException;
  public NamingEnumeration search(Name name, String filterExpr, Object[] filterArgs, SearchControls cons) throws NamingException;
  public NamingEnumeration search(String name, String filterExpr, Object[] filterArgs, SearchControls cons) throws NamingException;
}
