.class public final Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;
.super Landroid/appwidget/AppWidgetProvider;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;",
        "Landroid/appwidget/AppWidgetProvider;",
        "<init>",
        "()V",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:I

.field public static final f:I


# instance fields
.field public volatile a:Z

.field public final b:Ljava/lang/Object;

.field public c:Lv78;

.field public d:Lh81;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "#4ADE80"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->e:I

    .line 8
    .line 9
    const-string v0, "#9DC3DF"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->f:I

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final a(Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;Landroid/content/Context;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const p0, 0x7f11046f

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const p0, 0x7f110471

    .line 8
    .line 9
    .line 10
    :goto_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    sget p2, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->e:I

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    sget p2, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->f:I

    .line 16
    .line 17
    :goto_1
    new-instance v0, Landroid/widget/RemoteViews;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v2, 0x7f0c007f

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const v1, 0x7f090246

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, p0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, p2}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Landroid/content/Intent;

    .line 43
    .line 44
    const-class p2, Lcu/lestebang/utiletecsa/widget/VpnToggleActivity;

    .line 45
    .line 46
    invoke-direct {p0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 47
    .line 48
    .line 49
    const/high16 p2, 0x10000000

    .line 50
    .line 51
    invoke-virtual {p0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/high16 p2, 0xc000000

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-static {p1, v1, p0, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const p2, 0x7f090241

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p2, p0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance p2, Landroid/content/ComponentName;

    .line 73
    .line 74
    const-class v1, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;

    .line 75
    .line 76
    invoke-direct {p2, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p2, v0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    .line 80
    .line 81
    .line 82
    return-void
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
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v1, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->a:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lb96;->u(Landroid/content/Context;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lf88;

    .line 17
    .line 18
    check-cast v1, Lvd1;

    .line 19
    .line 20
    iget-object v1, v1, Lvd1;->L:Llu5;

    .line 21
    .line 22
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lv78;

    .line 27
    .line 28
    iput-object v1, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->c:Lv78;

    .line 29
    .line 30
    invoke-static {}, Lzv1;->a()Lh81;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->d:Lh81;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    iput-boolean v1, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->a:Z

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    .line 43
    goto :goto_2

    .line 44
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p0

    .line 46
    :cond_1
    :goto_2
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 47
    .line 48
    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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

.method public final onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {}, Lb85;->d()Lw77;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object p3, p0, Lcu/lestebang/utiletecsa/widget/VpnWidgetProvider;->d:Lh81;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-static {p2, p3}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p2}, Lgl0;->E(Le81;)Lig0;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    new-instance v0, Lpd7;

    .line 32
    .line 33
    const/4 v5, 0x7

    .line 34
    move-object v1, p0

    .line 35
    move-object v2, p1

    .line 36
    invoke-direct/range {v0 .. v5}, Lpd7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x3

    .line 40
    invoke-static {p2, v4, v4, v0, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p0, "ioDispatcher"

    .line 45
    .line 46
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v4
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
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
.end method
