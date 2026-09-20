.class public final Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroidx/window/sidecar/SidecarInterface$SidecarCallback;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0080\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "androidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback",
        "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;",
        "Landroidx/window/sidecar/SidecarDeviceState;",
        "newDeviceState",
        "Lvs7;",
        "onDeviceStateChanged",
        "(Landroidx/window/sidecar/SidecarDeviceState;)V",
        "Landroid/os/IBinder;",
        "windowToken",
        "Landroidx/window/sidecar/SidecarWindowLayoutInfo;",
        "newLayout",
        "onWindowLayoutChanged",
        "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V",
        "window_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lct6;


# direct methods
.method public constructor <init>(Lct6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->a:Lct6;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public onDeviceStateChanged(Landroidx/window/sidecar/SidecarDeviceState;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->a:Lct6;

    .line 5
    .line 6
    iget-object v0, v0, Lct6;->c:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->a:Lct6;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/app/Activity;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-object v3, v3, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object v3, v2

    .line 51
    :goto_1
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v4, p0, Lct6;->a:Landroidx/window/sidecar/SidecarInterface;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    invoke-interface {v4, v3}, Landroidx/window/sidecar/SidecarInterface;->getWindowLayoutInfo(Landroid/os/IBinder;)Landroidx/window/sidecar/SidecarWindowLayoutInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :cond_2
    iget-object v3, p0, Lct6;->e:Lcf4;

    .line 62
    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    iget-object v4, p0, Lct6;->b:Lzs6;

    .line 66
    .line 67
    invoke-virtual {v4, v2, p1}, Lzs6;->c(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Lpb8;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v3, v1, v2}, Lcf4;->x(Landroid/app/Activity;Lpb8;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    return-void
    .line 76
.end method

.method public onWindowLayoutChanged(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->a:Lct6;

    .line 8
    .line 9
    iget-object v0, v0, Lct6;->c:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/app/Activity;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const-string p0, "SidecarCompat"

    .line 20
    .line 21
    const-string p1, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?"

    .line 22
    .line 23
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->a:Lct6;

    .line 28
    .line 29
    iget-object v1, v0, Lct6;->b:Lzs6;

    .line 30
    .line 31
    iget-object v0, v0, Lct6;->a:Landroidx/window/sidecar/SidecarInterface;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Landroidx/window/sidecar/SidecarInterface;->getDeviceState()Landroidx/window/sidecar/SidecarDeviceState;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    :cond_1
    new-instance v0, Landroidx/window/sidecar/SidecarDeviceState;

    .line 42
    .line 43
    invoke-direct {v0}, Landroidx/window/sidecar/SidecarDeviceState;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {v1, p2, v0}, Lzs6;->c(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Lpb8;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-object p0, p0, Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;->a:Lct6;

    .line 51
    .line 52
    iget-object p0, p0, Lct6;->e:Lcf4;

    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Lcf4;->x(Landroid/app/Activity;Lpb8;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
