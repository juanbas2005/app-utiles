.class public final Lif8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmc2;


# instance fields
.field public final a:Lg1;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;

.field public final e:Lia5;


# direct methods
.method public constructor <init>(Lia5;)V
    .locals 4

    .line 1
    sget-object v0, Lpf8;->a:Lev2;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    sget-object v3, Lia5;->x:Lia5;

    .line 9
    .line 10
    if-ne p1, v3, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v3, Lia5;->y:Lia5;

    .line 19
    .line 20
    if-ne p1, v3, :cond_1

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v3, 0x0

    .line 25
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lif8;->a:Lg1;

    .line 32
    .line 33
    iput-object v1, p0, Lif8;->b:Ljava/lang/Integer;

    .line 34
    .line 35
    iput-object v3, p0, Lif8;->c:Ljava/lang/Integer;

    .line 36
    .line 37
    iput-object v2, p0, Lif8;->d:Ljava/lang/Integer;

    .line 38
    .line 39
    iput-object p1, p0, Lif8;->e:Lia5;

    .line 40
    .line 41
    return-void
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
.end method


# virtual methods
.method public final a()Lbz0;
    .locals 5

    .line 1
    new-instance v0, Lbz0;

    .line 2
    .line 3
    iget-object v1, p0, Lif8;->a:Lg1;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg1;->a()Lzq5;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lif8;->b:Ljava/lang/Integer;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const-string v3, "The minimum number of digits ("

    .line 23
    .line 24
    if-ltz v1, :cond_3

    .line 25
    .line 26
    const/16 v4, 0x9

    .line 27
    .line 28
    if-gt v1, v4, :cond_2

    .line 29
    .line 30
    iget-object p0, p0, Lif8;->c:Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    new-instance p0, Lbz0;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    return-object v0

    .line 41
    :cond_2
    const-string p0, ") exceeds the length of an Int"

    .line 42
    .line 43
    invoke-static {v1, v3, p0}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_3
    const-string p0, ") is negative"

    .line 52
    .line 53
    invoke-static {v1, v3, p0}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v2
    .line 61
    .line 62
    .line 63
.end method

.method public final b()Lqd5;
    .locals 12

    .line 1
    iget-object v0, p0, Lif8;->a:Lg1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg1;->a()Lzq5;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    invoke-virtual {v0}, Lg1;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    iget-object v1, p0, Lif8;->b:Ljava/lang/Integer;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iget-object v3, p0, Lif8;->c:Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-static/range {v1 .. v6}, Lj45;->r(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lbt;Ljava/lang/String;Z)Lqd5;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v7, v2

    .line 28
    filled-new-array {v0}, [Lqd5;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lsg3;->I([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v2, p0, Lif8;->d:Ljava/lang/Integer;

    .line 37
    .line 38
    sget-object p0, La42;->w:La42;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-static/range {v1 .. v6}, Lj45;->r(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lbt;Ljava/lang/String;Z)Lqd5;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    new-instance v8, Lqd5;

    .line 51
    .line 52
    new-instance v9, Lih5;

    .line 53
    .line 54
    const-string v1, "+"

    .line 55
    .line 56
    invoke-direct {v9, v1}, Lih5;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v10, Lz15;

    .line 60
    .line 61
    new-instance v1, Lwt7;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/4 v11, 0x1

    .line 68
    add-int/2addr v2, v11

    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    move-object v3, v7

    .line 74
    invoke-direct/range {v1 .. v6}, Lwt7;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lbt;Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {v10, v1}, Lz15;-><init>(Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    const/4 v1, 0x2

    .line 85
    new-array v1, v1, [Lpd5;

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    aput-object v9, v1, v2

    .line 89
    .line 90
    aput-object v10, v1, v11

    .line 91
    .line 92
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-direct {v8, v1, p0}, Lqd5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move-object v2, v7

    .line 104
    const/4 v6, 0x0

    .line 105
    invoke-static/range {v1 .. v6}, Lj45;->r(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lbt;Ljava/lang/String;Z)Lqd5;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :goto_0
    new-instance v1, Lqd5;

    .line 113
    .line 114
    invoke-direct {v1, p0, v0}, Lqd5;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    return-object v1
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final c()Lg1;
    .locals 0

    .line 1
    iget-object p0, p0, Lif8;->a:Lg1;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lif8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lif8;

    .line 6
    .line 7
    iget-object p1, p1, Lif8;->e:Lia5;

    .line 8
    .line 9
    iget-object p0, p0, Lif8;->e:Lia5;

    .line 10
    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object p0, p0, Lif8;->e:Lia5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
