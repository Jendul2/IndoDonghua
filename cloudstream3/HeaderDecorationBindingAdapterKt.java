/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  androidx.annotation.LayoutRes
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.lagradost.cloudstream3.ui.HeaderViewDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=2, xi=48, d1={"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, d2={"setHeaderDecoration", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "headerViewRes", "", "app_prereleaseDebug"})
public final class HeaderDecorationBindingAdapterKt {
    public static final void setHeaderDecoration(@NotNull RecyclerView view, @LayoutRes int headerViewRes) {
        Intrinsics.checkNotNullParameter((Object)view, (String)"view");
        View headerView = LayoutInflater.from((Context)view.getContext()).inflate(headerViewRes, null);
        Intrinsics.checkNotNull((Object)headerView);
        view.addItemDecoration((RecyclerView.ItemDecoration)new HeaderViewDecoration(headerView));
    }
}

