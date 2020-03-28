// Generated by data binding compiler. Do not edit!
package com.doiliomatsinhe.tourguide.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.doiliomatsinhe.tourguide.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ContentItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView contentDescription;

  @NonNull
  public final ImageView contentImage;

  @NonNull
  public final ConstraintLayout contentMain;

  @NonNull
  public final TextView contentName;

  protected ContentItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView contentDescription, ImageView contentImage, ConstraintLayout contentMain,
      TextView contentName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentDescription = contentDescription;
    this.contentImage = contentImage;
    this.contentMain = contentMain;
    this.contentName = contentName;
  }

  @NonNull
  public static ContentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.content_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ContentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ContentItemBinding>inflateInternal(inflater, R.layout.content_item, root, attachToRoot, component);
  }

  @NonNull
  public static ContentItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.content_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ContentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ContentItemBinding>inflateInternal(inflater, R.layout.content_item, null, false, component);
  }

  public static ContentItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ContentItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ContentItemBinding)bind(component, view, R.layout.content_item);
  }
}
