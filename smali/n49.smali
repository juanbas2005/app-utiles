.class public final synthetic Ln49;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ly45;
.implements Lc99;
.implements Lct;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ln49;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ln49;->x:Ljava/lang/Object;

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

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 15
    iput p1, p0, Ln49;->w:I

    iput-object p2, p0, Ln49;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public K(Lyb9;)V
    .locals 2

    .line 1
    iget v0, p0, Ln49;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Ln49;->x:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ly99;

    .line 10
    .line 11
    iget-boolean v0, p1, Lyb9;->d:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ly99;->cancel(Z)Z

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lyb9;->k()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Lyb9;->i()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    sget-object p1, Lsw8;->z:Ljava/lang/Object;

    .line 33
    .line 34
    :cond_1
    sget-object v0, Lsw8;->C:Lo85;

    .line 35
    .line 36
    invoke-virtual {v0, p0, v1, p1}, Lo85;->E(Lsw8;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-static {p0}, Ly99;->e(Ly99;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {p1}, Lyb9;->h()Ljava/lang/Exception;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    new-instance v0, Ljw8;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Ljw8;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, Lsw8;->C:Lo85;

    .line 58
    .line 59
    invoke-virtual {p1, p0, v1, v0}, Lo85;->E(Lsw8;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-static {p0}, Ly99;->e(Ly99;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_0
    return-void

    .line 69
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :pswitch_0
    iget-object p0, p0, Ln49;->x:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Li49;

    .line 78
    .line 79
    iget-boolean v0, p1, Lyb9;->d:Z

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lx1;->cancel(Z)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    invoke-virtual {p1}, Lyb9;->k()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    invoke-virtual {p1}, Lyb9;->i()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lx1;->l(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    invoke-virtual {p1}, Lyb9;->h()Ljava/lang/Exception;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-eqz p1, :cond_7

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lx1;->m(Ljava/lang/Throwable;)Z

    .line 108
    .line 109
    .line 110
    :goto_1
    return-void

    .line 111
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public synthetic call()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 1
    iget-object p0, p0, Ln49;->x:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lx1;

    .line 4
    .line 5
    return-object p0
    .line 6
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
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ln49;->x:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lv89;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, v1, Lv89;->H:Ly19;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 16
    .line 17
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lpz8;->B:Lmz8;

    .line 21
    .line 22
    const-string p1, "AppId not known when logging event"

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    invoke-virtual {v1}, Lv89;->n0()Lr19;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lyl0;

    .line 33
    .line 34
    const/16 v6, 0xc

    .line 35
    .line 36
    move-object v2, p0

    .line 37
    move-object v3, p1

    .line 38
    move-object v4, p2

    .line 39
    move-object v5, p3

    .line 40
    invoke-direct/range {v1 .. v6}, Lyl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
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
