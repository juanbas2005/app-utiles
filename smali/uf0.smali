.class public final Luf0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final y:I

.field public final synthetic z:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Lb94;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Luf0;->w:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luf0;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    .line 30
    iput v0, p0, Luf0;->x:I

    .line 31
    iget-object p1, p1, Lb94;->x:[B

    array-length p1, p1

    .line 32
    iput p1, p0, Luf0;->y:I

    return-void
.end method

.method public constructor <init>(Lqz8;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Luf0;->w:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Luf0;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    iput v0, p0, Luf0;->x:I

    invoke-virtual {p1}, Lqz8;->k()I

    move-result p1

    iput p1, p0, Luf0;->y:I

    return-void
.end method

.method public constructor <init>(Lvk8;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Luf0;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luf0;->z:Ljava/lang/Iterable;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Luf0;->x:I

    .line 11
    .line 12
    invoke-virtual {p1}, Lvk8;->f()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Luf0;->y:I

    .line 17
    .line 18
    return-void
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

.method public constructor <init>(Lyf0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Luf0;->w:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Luf0;->z:Ljava/lang/Iterable;

    .line 23
    iput v0, p0, Luf0;->x:I

    .line 24
    invoke-virtual {p1}, Lyf0;->size()I

    move-result p1

    iput p1, p0, Luf0;->y:I

    return-void
.end method

.method public constructor <init>(Lzf0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Luf0;->w:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Luf0;->z:Ljava/lang/Iterable;

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Luf0;->x:I

    .line 28
    invoke-virtual {p1}, Lzf0;->size()I

    move-result p1

    iput p1, p0, Luf0;->y:I

    return-void
.end method


# virtual methods
.method public a()B
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Luf0;->z:Ljava/lang/Iterable;

    .line 2
    .line 3
    check-cast v0, Lb94;

    .line 4
    .line 5
    iget-object v0, v0, Lb94;->x:[B

    .line 6
    .line 7
    iget v1, p0, Luf0;->x:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iput v2, p0, Luf0;->x:I

    .line 12
    .line 13
    aget-byte p0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    return p0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lkj6;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
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
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Luf0;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Luf0;->x:I

    .line 7
    .line 8
    iget p0, p0, Luf0;->y:I

    .line 9
    .line 10
    if-ge v0, p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    return p0

    .line 16
    :pswitch_0
    iget v0, p0, Luf0;->x:I

    .line 17
    .line 18
    iget p0, p0, Luf0;->y:I

    .line 19
    .line 20
    if-ge v0, p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_1
    return p0

    .line 26
    :pswitch_1
    iget v0, p0, Luf0;->x:I

    .line 27
    .line 28
    iget p0, p0, Luf0;->y:I

    .line 29
    .line 30
    if-ge v0, p0, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    :goto_2
    return p0

    .line 36
    :pswitch_2
    iget v0, p0, Luf0;->x:I

    .line 37
    .line 38
    iget p0, p0, Luf0;->y:I

    .line 39
    .line 40
    if-ge v0, p0, :cond_3

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    const/4 p0, 0x0

    .line 45
    :goto_3
    return p0

    .line 46
    :pswitch_3
    iget v0, p0, Luf0;->x:I

    .line 47
    .line 48
    iget p0, p0, Luf0;->y:I

    .line 49
    .line 50
    if-ge v0, p0, :cond_4

    .line 51
    .line 52
    const/4 p0, 0x1

    .line 53
    goto :goto_4

    .line 54
    :cond_4
    const/4 p0, 0x0

    .line 55
    :goto_4
    return p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Luf0;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Luf0;->z:Ljava/lang/Iterable;

    .line 5
    .line 6
    iget v3, p0, Luf0;->y:I

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget v0, p0, Luf0;->x:I

    .line 12
    .line 13
    if-ge v0, v3, :cond_0

    .line 14
    .line 15
    add-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    iput v1, p0, Luf0;->x:I

    .line 18
    .line 19
    check-cast v2, Lqz8;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lqz8;->f(I)B

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {}, Lrf2;->c()V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-object v1

    .line 34
    :pswitch_0
    iget v0, p0, Luf0;->x:I

    .line 35
    .line 36
    if-ge v0, v3, :cond_1

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0x1

    .line 39
    .line 40
    iput v1, p0, Luf0;->x:I

    .line 41
    .line 42
    check-cast v2, Lvk8;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Lvk8;->d(I)B

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {}, Lrf2;->c()V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-object v1

    .line 57
    :pswitch_1
    invoke-virtual {p0}, Luf0;->a()B

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_2
    iget v0, p0, Luf0;->x:I

    .line 67
    .line 68
    if-ge v0, v3, :cond_2

    .line 69
    .line 70
    add-int/lit8 v1, v0, 0x1

    .line 71
    .line 72
    iput v1, p0, Luf0;->x:I

    .line 73
    .line 74
    check-cast v2, Lzf0;

    .line 75
    .line 76
    invoke-virtual {v2, v0}, Lzf0;->n(I)B

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-static {}, Lrf2;->c()V

    .line 86
    .line 87
    .line 88
    :goto_2
    return-object v1

    .line 89
    :pswitch_3
    iget v0, p0, Luf0;->x:I

    .line 90
    .line 91
    if-ge v0, v3, :cond_3

    .line 92
    .line 93
    add-int/lit8 v1, v0, 0x1

    .line 94
    .line 95
    iput v1, p0, Luf0;->x:I

    .line 96
    .line 97
    check-cast v2, Lyf0;

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Lyf0;->k(I)B

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    invoke-static {}, Lrf2;->c()V

    .line 109
    .line 110
    .line 111
    :goto_3
    return-object v1

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final remove()V
    .locals 0

    .line 1
    iget p0, p0, Luf0;->w:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0

    .line 18
    :pswitch_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :pswitch_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :pswitch_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
