.class public final synthetic Lio6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;

.field public final synthetic y:Lse4;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lse4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lio6;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lio6;->x:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lio6;->y:Lse4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
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


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lio6;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/16 v2, 0x21

    .line 6
    .line 7
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    .line 8
    .line 9
    iget-object v4, p0, Lio6;->y:Lse4;

    .line 10
    .line 11
    iget-object p0, p0, Lio6;->x:Landroid/content/Context;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    new-instance v0, Landroid/content/Intent;

    .line 23
    .line 24
    const-class v5, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;

    .line 25
    .line 26
    invoke-direct {v0, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    if-lt p1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p0, v3}, Lsg3;->A(Landroid/content/Context;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4, v3}, Lse4;->d0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {p0, v0}, Lag8;->H(Landroid/content/Context;Landroid/content/Intent;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-object v1

    .line 53
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    .line 54
    .line 55
    const-class v5, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;

    .line 56
    .line 57
    invoke-direct {v0, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 58
    .line 59
    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    invoke-static {}, Lsg3;->m()Ln74;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v5, "android.permission.READ_PHONE_STATE"

    .line 71
    .line 72
    invoke-virtual {p1, v5}, Ln74;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    if-lt v5, v2, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1, v3}, Ln74;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-static {p1}, Lsg3;->i(Ln74;)Ln74;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    new-instance v2, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-virtual {p1, v3}, Ln74;->listIterator(I)Ljava/util/ListIterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_4
    :goto_1
    move-object v5, p1

    .line 97
    check-cast v5, Ld03;

    .line 98
    .line 99
    invoke-virtual {v5}, Ld03;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    invoke-virtual {v5}, Ld03;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    move-object v6, v5

    .line 110
    check-cast v6, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {p0, v6}, Lsg3;->A(Landroid/content/Context;Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_4

    .line 117
    .line 118
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_6

    .line 127
    .line 128
    invoke-static {p0, v0}, Lag8;->H(Landroid/content/Context;Landroid/content/Intent;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    new-array p0, v3, [Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v4, p0}, Lse4;->d0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :goto_2
    return-object v1

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
