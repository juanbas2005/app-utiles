.class public final Lo3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public final z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lo3;->w:I

    iput-object p1, p0, Lo3;->x:Ljava/lang/Object;

    iput-object p2, p0, Lo3;->y:Ljava/lang/Object;

    iput-object p3, p0, Lo3;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lr3;Lkb4;Lpe2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lo3;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lo3;->z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lo3;->x:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lo3;->y:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lo3;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lo3;->z:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lo3;->y:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lo3;->x:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lm14;

    .line 13
    .line 14
    check-cast v2, Le16;

    .line 15
    .line 16
    check-cast v1, Lh06;

    .line 17
    .line 18
    iget-object v0, p0, Lm14;->b:Lam6;

    .line 19
    .line 20
    iget-object v0, v0, Lam6;->x:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lpj3;

    .line 23
    .line 24
    iget-object v0, v0, Lpj3;->a:Lkb4;

    .line 25
    .line 26
    new-instance v3, Lp3;

    .line 27
    .line 28
    invoke-direct {v3, p0, v2, v1}, Lp3;-><init>(Lm14;Le16;Lh06;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance p0, Lhb4;

    .line 35
    .line 36
    invoke-direct {p0, v0, v3}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p0, Loq3;

    .line 41
    .line 42
    check-cast v2, Ljava/lang/Class;

    .line 43
    .line 44
    check-cast v1, Lgq0;

    .line 45
    .line 46
    iget-object v0, p0, Loq3;->x:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v3}, Lqs;->c1(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-ltz v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    aget-object p0, p0, v2

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const-string v0, "No superclass of "

    .line 90
    .line 91
    const-string v2, " in Java reflection for "

    .line 92
    .line 93
    invoke-static {v0, p0, v2, v1}, Lh;->r(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x0

    .line 97
    :goto_0
    return-object p0

    .line 98
    :pswitch_1
    check-cast v1, Laq4;

    .line 99
    .line 100
    check-cast p0, Len2;

    .line 101
    .line 102
    invoke-interface {v1, p0}, Laq4;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Len2;->e:Ljava/lang/String;

    .line 106
    .line 107
    if-nez v0, :cond_2

    .line 108
    .line 109
    iget-boolean v0, p0, Len2;->g:Z

    .line 110
    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    check-cast v2, Lvr2;

    .line 114
    .line 115
    iget-object p0, p0, Len2;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v2, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_2
    sget-object p0, Lvs7;->a:Lvs7;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_2
    check-cast p0, Lfp3;

    .line 124
    .line 125
    check-cast v2, Ljava/io/ByteArrayInputStream;

    .line 126
    .line 127
    check-cast v1, Lqt1;

    .line 128
    .line 129
    iget-object v0, v1, Lqt1;->b:Lz00;

    .line 130
    .line 131
    iget-object v0, v0, Lz00;->a:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lws1;

    .line 134
    .line 135
    iget-object v0, v0, Lws1;->p:Ly92;

    .line 136
    .line 137
    invoke-virtual {p0, v2, v0}, Lfp3;->a(Ljava/io/ByteArrayInputStream;Ly92;)Lk2;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_3
    new-instance v0, Lq3;

    .line 143
    .line 144
    check-cast v1, Lr3;

    .line 145
    .line 146
    check-cast p0, Lkb4;

    .line 147
    .line 148
    check-cast v2, Lpe2;

    .line 149
    .line 150
    invoke-direct {v0, v1, p0, v2}, Lq3;-><init>(Lr3;Lkb4;Lpe2;)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
