.class public final Lpi6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Li06;

.field public e:Z

.field public f:Lpi6;

.field public g:Lpi6;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2000

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Lpi6;->a:[B

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lpi6;->e:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lpi6;->d:Li06;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>([BIILi06;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lpi6;->a:[B

    .line 19
    iput p2, p0, Lpi6;->b:I

    .line 20
    iput p3, p0, Lpi6;->c:I

    .line 21
    iput-object p4, p0, Lpi6;->d:Li06;

    const/4 p1, 0x0

    .line 22
    iput-boolean p1, p0, Lpi6;->e:Z

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lpi6;->c:I

    .line 2
    .line 3
    iget p0, p0, Lpi6;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
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

.method public final b(I)B
    .locals 1

    .line 1
    iget v0, p0, Lpi6;->b:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget-object p0, p0, Lpi6;->a:[B

    .line 5
    .line 6
    aget-byte p0, p0, v0

    .line 7
    .line 8
    return p0
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

.method public final c()Lpi6;
    .locals 3

    .line 1
    iget-object v0, p0, Lpi6;->f:Lpi6;

    .line 2
    .line 3
    iget-object v1, p0, Lpi6;->g:Lpi6;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lpi6;->f:Lpi6;

    .line 11
    .line 12
    iput-object v2, v1, Lpi6;->f:Lpi6;

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lpi6;->f:Lpi6;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lpi6;->g:Lpi6;

    .line 22
    .line 23
    iput-object v2, v1, Lpi6;->g:Lpi6;

    .line 24
    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    iput-object v1, p0, Lpi6;->f:Lpi6;

    .line 27
    .line 28
    iput-object v1, p0, Lpi6;->g:Lpi6;

    .line 29
    .line 30
    return-object v0
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

.method public final d(Lpi6;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p0, p1, Lpi6;->g:Lpi6;

    .line 5
    .line 6
    iget-object v0, p0, Lpi6;->f:Lpi6;

    .line 7
    .line 8
    iput-object v0, p1, Lpi6;->f:Lpi6;

    .line 9
    .line 10
    iget-object v0, p0, Lpi6;->f:Lpi6;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object p1, v0, Lpi6;->g:Lpi6;

    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, Lpi6;->f:Lpi6;

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

.method public final e()Lpi6;
    .locals 4

    .line 1
    iget-object v0, p0, Lpi6;->d:Li06;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lui6;->a:Lpi6;

    .line 6
    .line 7
    new-instance v0, Li06;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpi6;->d:Li06;

    .line 13
    .line 14
    :cond_0
    iget v1, p0, Lpi6;->b:I

    .line 15
    .line 16
    iget v2, p0, Lpi6;->c:I

    .line 17
    .line 18
    sget-object v3, Li06;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    new-instance v3, Lpi6;

    .line 24
    .line 25
    iget-object p0, p0, Lpi6;->a:[B

    .line 26
    .line 27
    invoke-direct {v3, p0, v1, v2, v0}, Lpi6;-><init>([BIILi06;)V

    .line 28
    .line 29
    .line 30
    return-object v3
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

.method public final f(Lpi6;I)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lpi6;->e:Z

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    iget v0, p1, Lpi6;->c:I

    .line 9
    .line 10
    add-int/2addr v0, p2

    .line 11
    const/16 v1, 0x2000

    .line 12
    .line 13
    if-le v0, v1, :cond_3

    .line 14
    .line 15
    iget-object v0, p1, Lpi6;->d:Li06;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget v0, v0, Li06;->a:I

    .line 20
    .line 21
    if-gtz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Lku4;->v()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    iget v6, p1, Lpi6;->c:I

    .line 29
    .line 30
    add-int v0, v6, p2

    .line 31
    .line 32
    iget v5, p1, Lpi6;->b:I

    .line 33
    .line 34
    sub-int/2addr v0, v5

    .line 35
    if-gt v0, v1, :cond_2

    .line 36
    .line 37
    iget-object v2, p1, Lpi6;->a:[B

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v7, 0x2

    .line 41
    move-object v3, v2

    .line 42
    invoke-static/range {v2 .. v7}, Lqs;->O0([B[BIIII)V

    .line 43
    .line 44
    .line 45
    iget v0, p1, Lpi6;->c:I

    .line 46
    .line 47
    iget v1, p1, Lpi6;->b:I

    .line 48
    .line 49
    sub-int/2addr v0, v1

    .line 50
    iput v0, p1, Lpi6;->c:I

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    iput v0, p1, Lpi6;->b:I

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-static {}, Lku4;->v()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    :goto_1
    iget-object v0, p0, Lpi6;->a:[B

    .line 61
    .line 62
    iget-object v1, p1, Lpi6;->a:[B

    .line 63
    .line 64
    iget v2, p1, Lpi6;->c:I

    .line 65
    .line 66
    iget v3, p0, Lpi6;->b:I

    .line 67
    .line 68
    add-int v4, v3, p2

    .line 69
    .line 70
    invoke-static {v2, v3, v4, v0, v1}, Lqs;->I0(III[B[B)V

    .line 71
    .line 72
    .line 73
    iget v0, p1, Lpi6;->c:I

    .line 74
    .line 75
    add-int/2addr v0, p2

    .line 76
    iput v0, p1, Lpi6;->c:I

    .line 77
    .line 78
    iget p1, p0, Lpi6;->b:I

    .line 79
    .line 80
    add-int/2addr p1, p2

    .line 81
    iput p1, p0, Lpi6;->b:I

    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    const-string p0, "only owner can write"

    .line 85
    .line 86
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
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
