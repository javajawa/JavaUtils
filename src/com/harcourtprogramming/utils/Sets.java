package com.harcourtprogramming.utils;

import java.util.HashSet;
import java.util.Set;
import org.jaudiotagger.audio.asf.data.GUID;

/**
 *
 * @author Benedict
 */
public final class Sets {
  private Sets()
  {
    // Nothing to see here. Move along, citizen!
  }

  static public Set<GUID> union(Set<? extends GUID> a, Set<? extends GUID> b)
  {
    Set<GUID> u = new HashSet<GUID>(a);
    u.addAll(b);

    return u;
  }

  static public Set<GUID> intersection(Set<? extends GUID> a, Set<? extends GUID> b)
  {
    Set<GUID> u = new HashSet<GUID>(a);
    u.retainAll(b);

    return u;
  }
}
