package com.doiliomatsinhe.tourguide;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.doiliomatsinhe.tourguide.databinding.ActivityDetailBindingImpl;
import com.doiliomatsinhe.tourguide.databinding.ActivityMainBindingImpl;
import com.doiliomatsinhe.tourguide.databinding.ContentItemBindingImpl;
import com.doiliomatsinhe.tourguide.databinding.ContentListBindingImpl;
import com.doiliomatsinhe.tourguide.databinding.FragmentMainBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAIL = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_CONTENTITEM = 3;

  private static final int LAYOUT_CONTENTLIST = 4;

  private static final int LAYOUT_FRAGMENTMAIN = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.doiliomatsinhe.tourguide.R.layout.activity_detail, LAYOUT_ACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.doiliomatsinhe.tourguide.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.doiliomatsinhe.tourguide.R.layout.content_item, LAYOUT_CONTENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.doiliomatsinhe.tourguide.R.layout.content_list, LAYOUT_CONTENTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.doiliomatsinhe.tourguide.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAIL: {
          if ("layout/activity_detail_0".equals(tag)) {
            return new ActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTITEM: {
          if ("layout/content_item_0".equals(tag)) {
            return new ContentItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_item is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTLIST: {
          if ("layout/content_list_0".equals(tag)) {
            return new ContentListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_detail_0", com.doiliomatsinhe.tourguide.R.layout.activity_detail);
      sKeys.put("layout/activity_main_0", com.doiliomatsinhe.tourguide.R.layout.activity_main);
      sKeys.put("layout/content_item_0", com.doiliomatsinhe.tourguide.R.layout.content_item);
      sKeys.put("layout/content_list_0", com.doiliomatsinhe.tourguide.R.layout.content_list);
      sKeys.put("layout/fragment_main_0", com.doiliomatsinhe.tourguide.R.layout.fragment_main);
    }
  }
}
