.class public final Lpg1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lpg1;->w:I

    .line 2
    .line 3
    iput-boolean p3, p0, Lpg1;->x:Z

    .line 4
    .line 5
    iput-object p2, p0, Lpg1;->y:Ljava/lang/Object;

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
    .locals 4

    .line 1
    iget v0, p0, Lpg1;->w:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lpg1;->y:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean p0, p0, Lpg1;->x:Z

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lqs3;

    .line 13
    .line 14
    iget-object p1, p1, Lqs3;->a:Landroid/view/KeyEvent;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Ldh4;->w(Landroid/view/KeyEvent;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    check-cast v3, Lsr2;

    .line 25
    .line 26
    invoke-interface {v3}, Lsr2;->b()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    :goto_0
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, Lqs3;

    .line 36
    .line 37
    iget-object p1, p1, Lqs3;->a:Landroid/view/KeyEvent;

    .line 38
    .line 39
    check-cast v3, Lik2;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Lgi1;->p(Landroid/view/KeyEvent;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-static {p1}, Lgi1;->q(Landroid/view/KeyEvent;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    :goto_1
    if-eqz v0, :cond_2

    .line 53
    .line 54
    check-cast v3, Llk2;

    .line 55
    .line 56
    invoke-virtual {v3, v2, v2}, Llk2;->h(IZ)Z

    .line 57
    .line 58
    .line 59
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, Lgi1;->q(Landroid/view/KeyEvent;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {p1}, Lgi1;->p(Landroid/view/KeyEvent;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    :goto_2
    if-eqz p0, :cond_4

    .line 74
    .line 75
    check-cast v3, Llk2;

    .line 76
    .line 77
    invoke-virtual {v3, v1, v2}, Llk2;->h(IZ)Z

    .line 78
    .line 79
    .line 80
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    :goto_3
    return-object p0

    .line 86
    :pswitch_1
    check-cast p1, Lqs3;

    .line 87
    .line 88
    iget-object p1, p1, Lqs3;->a:Landroid/view/KeyEvent;

    .line 89
    .line 90
    check-cast v3, Lik2;

    .line 91
    .line 92
    if-eqz p0, :cond_5

    .line 93
    .line 94
    const/4 p0, 0x3

    .line 95
    goto :goto_4

    .line 96
    :cond_5
    const/4 p0, 0x4

    .line 97
    :goto_4
    invoke-static {p1}, Ldh4;->w(Landroid/view/KeyEvent;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    check-cast v3, Llk2;

    .line 104
    .line 105
    invoke-virtual {v3, p0, v2}, Llk2;->h(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-nez p0, :cond_6

    .line 110
    .line 111
    invoke-virtual {v3, v2, v2}, Llk2;->h(IZ)Z

    .line 112
    .line 113
    .line 114
    :cond_6
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_7
    invoke-static {p1}, Ldh4;->v(Landroid/view/KeyEvent;)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_8

    .line 122
    .line 123
    check-cast v3, Llk2;

    .line 124
    .line 125
    invoke-virtual {v3, p0, v2}, Llk2;->h(IZ)Z

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v1, v2}, Llk2;->h(IZ)Z

    .line 129
    .line 130
    .line 131
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_8
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 135
    .line 136
    :goto_5
    return-object p0

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
