.class public final Lxe1;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic A:I

.field public B:I

.field public synthetic C:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILf61;)V
    .locals 1

    .line 11
    const/4 v0, 0x1

    iput v0, p0, Lxe1;->A:I

    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    return-void
.end method

.method public constructor <init>(Ljf1;Lf61;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lxe1;->A:I

    .line 3
    .line 4
    iput-object p1, p0, Lxe1;->C:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

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
.end method


# virtual methods
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lxe1;->A:I

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    sget-object v2, Lp81;->w:Lp81;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lxe1;->B:I

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    move-object p1, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lxe1;->C:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lfd2;

    .line 33
    .line 34
    iput v3, p0, Lxe1;->B:I

    .line 35
    .line 36
    iget-object v0, p1, Lfd2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p1, Lfd2;->a:Ljava/io/File;

    .line 45
    .line 46
    new-instance v1, Lxc;

    .line 47
    .line 48
    const/4 v3, 0x5

    .line 49
    invoke-direct {v1, p1, v4, v3}, Lxc;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, p0}, Lsg3;->d(Ljava/io/File;Lvr2;Lh61;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v2, :cond_3

    .line 57
    .line 58
    move-object p1, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const-string p0, "This scope has already been closed."

    .line 61
    .line 62
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    :goto_1
    return-object p1

    .line 67
    :pswitch_0
    iget v0, p0, Lxe1;->B:I

    .line 68
    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    if-ne v0, v3, :cond_4

    .line 72
    .line 73
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    move-object v2, v4

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lxe1;->C:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Ljf1;

    .line 88
    .line 89
    iput v3, p0, Lxe1;->B:I

    .line 90
    .line 91
    invoke-static {p1, p0}, Ljf1;->c(Ljf1;Lh61;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-ne p0, v2, :cond_6

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    :goto_2
    sget-object v2, Lvs7;->a:Lvs7;

    .line 99
    .line 100
    :goto_3
    return-object v2

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lxe1;->A:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lfd2;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p3, Lf61;

    .line 16
    .line 17
    new-instance p0, Lxe1;

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    invoke-direct {p0, p2, p3}, Lxe1;-><init>(ILf61;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lxe1;->C:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lxe1;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Lfi2;

    .line 31
    .line 32
    check-cast p2, Ljava/lang/Throwable;

    .line 33
    .line 34
    check-cast p3, Lf61;

    .line 35
    .line 36
    new-instance p1, Lxe1;

    .line 37
    .line 38
    iget-object p0, p0, Lxe1;->C:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljf1;

    .line 41
    .line 42
    invoke-direct {p1, p0, p3}, Lxe1;-><init>(Ljf1;Lf61;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1}, Lxe1;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
