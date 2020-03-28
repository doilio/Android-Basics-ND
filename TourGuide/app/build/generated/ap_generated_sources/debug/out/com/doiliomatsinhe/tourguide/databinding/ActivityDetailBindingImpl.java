package com.doiliomatsinhe.tourguide.databinding;
import com.doiliomatsinhe.tourguide.R;
import com.doiliomatsinhe.tourguide.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBindingImpl extends ActivityDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.content_cover, 1);
        sViewsWithIds.put(R.id.content_name, 2);
        sViewsWithIds.put(R.id.guidelineLeft, 3);
        sViewsWithIds.put(R.id.guidelineRight, 4);
        sViewsWithIds.put(R.id.location_icon, 5);
        sViewsWithIds.put(R.id.content_location, 6);
        sViewsWithIds.put(R.id.hours_icon, 7);
        sViewsWithIds.put(R.id.content_hours, 8);
        sViewsWithIds.put(R.id.telephone_icon, 9);
        sViewsWithIds.put(R.id.content_telephone, 10);
        sViewsWithIds.put(R.id.website_icon, 11);
        sViewsWithIds.put(R.id.content_website, 12);
        sViewsWithIds.put(R.id.description_title, 13);
        sViewsWithIds.put(R.id.content_description, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            );
        this.scrollView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}