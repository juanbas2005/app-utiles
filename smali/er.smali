.class public final Ler;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public a:Landroid/content/Context;


# virtual methods
.method public a()Lzd1;
    .locals 14

    .line 1
    iget-object p0, p0, Ler;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lzd1;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lsu0;->e:Lc82;

    .line 11
    .line 12
    invoke-static {v1}, Ldx1;->a(Ldb2;)Lmu5;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lzd1;->w:Lmu5;

    .line 17
    .line 18
    new-instance v1, Lfb1;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, v2, p0}, Lfb1;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lzd1;->x:Lfb1;

    .line 25
    .line 26
    new-instance p0, Lfb1;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {p0, v3, v1}, Lfb1;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v4, Lik4;

    .line 33
    .line 34
    invoke-direct {v4, v1, p0, v3}, Lik4;-><init>(Lmu5;Lmu5;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, Ldx1;->a(Ldb2;)Lmu5;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iput-object p0, v0, Lzd1;->y:Lmu5;

    .line 42
    .line 43
    iget-object p0, v0, Lzd1;->x:Lfb1;

    .line 44
    .line 45
    new-instance v1, Lq72;

    .line 46
    .line 47
    invoke-direct {v1, p0, v2}, Lq72;-><init>(Lmu5;I)V

    .line 48
    .line 49
    .line 50
    iput-object v1, v0, Lzd1;->z:Lq72;

    .line 51
    .line 52
    new-instance v1, Lq72;

    .line 53
    .line 54
    invoke-direct {v1, p0, v3}, Lq72;-><init>(Lmu5;I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Ldx1;->a(Ldb2;)Lmu5;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object v1, v0, Lzd1;->z:Lq72;

    .line 62
    .line 63
    new-instance v4, Lik4;

    .line 64
    .line 65
    invoke-direct {v4, v1, p0, v2}, Lik4;-><init>(Lmu5;Lmu5;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {v4}, Ldx1;->a(Ldb2;)Lmu5;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    iput-object v8, v0, Lzd1;->A:Lmu5;

    .line 73
    .line 74
    new-instance p0, Lc82;

    .line 75
    .line 76
    invoke-direct {p0, v2}, Lc82;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v0, Lzd1;->x:Lfb1;

    .line 80
    .line 81
    new-instance v9, Lng6;

    .line 82
    .line 83
    invoke-direct {v9, v1, v8, p0, v3}, Lng6;-><init>(Lmu5;Lmu5;Ldb2;I)V

    .line 84
    .line 85
    .line 86
    iget-object v6, v0, Lzd1;->w:Lmu5;

    .line 87
    .line 88
    iget-object v7, v0, Lzd1;->y:Lmu5;

    .line 89
    .line 90
    new-instance v5, Lfn1;

    .line 91
    .line 92
    move-object v10, v8

    .line 93
    move-object v13, v9

    .line 94
    move-object v9, v8

    .line 95
    move-object v8, v13

    .line 96
    invoke-direct/range {v5 .. v10}, Lfn1;-><init>(Lmu5;Lmu5;Lng6;Lmu5;Lmu5;)V

    .line 97
    .line 98
    .line 99
    move-object p0, v9

    .line 100
    move-object v9, v8

    .line 101
    move-object v8, p0

    .line 102
    move-object p0, v5

    .line 103
    new-instance v5, Lpu7;

    .line 104
    .line 105
    move-object v11, v8

    .line 106
    move-object v12, v8

    .line 107
    move-object v10, v6

    .line 108
    move-object v6, v1

    .line 109
    invoke-direct/range {v5 .. v12}, Lpu7;-><init>(Lmu5;Lmu5;Lmu5;Lng6;Lmu5;Lmu5;Lmu5;)V

    .line 110
    .line 111
    .line 112
    move-object v6, v10

    .line 113
    new-instance v1, Lmd8;

    .line 114
    .line 115
    invoke-direct {v1, v6, v8, v9, v8}, Lmd8;-><init>(Lmu5;Lmu5;Lng6;Lmu5;)V

    .line 116
    .line 117
    .line 118
    new-instance v3, Lng6;

    .line 119
    .line 120
    invoke-direct {v3, p0, v5, v1, v2}, Lng6;-><init>(Lmu5;Lmu5;Ldb2;I)V

    .line 121
    .line 122
    .line 123
    invoke-static {v3}, Ldx1;->a(Ldb2;)Lmu5;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iput-object p0, v0, Lzd1;->B:Lmu5;

    .line 128
    .line 129
    return-object v0

    .line 130
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    const-class v0, Landroid/content/Context;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v1, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, " must be set"

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p0
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
