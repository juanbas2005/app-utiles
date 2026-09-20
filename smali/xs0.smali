.class public Lxs0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lwb6;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 71
    iput p1, p0, Lxs0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;[B)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lxs0;->a:I

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 74
    iput-object p2, p0, Lxs0;->d:Ljava/lang/Object;

    .line 75
    iput v0, p0, Lxs0;->c:I

    .line 76
    array-length p1, p2

    iput p1, p0, Lxs0;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;ILjava/util/Locale;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lxs0;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v0, "input start index is outside the CharSequence"

    .line 17
    .line 18
    invoke-static {v0}, Lzb3;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    if-ltz p2, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-gt p2, v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const-string v0, "input end index is outside the CharSequence"

    .line 31
    .line 32
    invoke-static {v0}, Lzb3;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-static {p3}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    iput-object p3, p0, Lxs0;->e:Ljava/lang/Object;

    .line 40
    .line 41
    const/16 v0, -0x32

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, Lxs0;->b:I

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/lit8 v1, p2, 0x32

    .line 55
    .line 56
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Lxs0;->c:I

    .line 61
    .line 62
    new-instance p0, Lgo0;

    .line 63
    .line 64
    invoke-direct {p0, p2, p1}, Lgo0;-><init>(ILjava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p3, p0}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    .line 68
    .line 69
    .line 70
    return-void
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

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lxs0;->a:I

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 86
    iput v0, p0, Lxs0;->b:I

    .line 87
    iput v0, p0, Lxs0;->c:I

    .line 88
    new-instance v0, Lbc4;

    .line 89
    invoke-direct {v0}, Lbc4;-><init>()V

    .line 90
    iput-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 92
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Lxs0;->c:I

    return-void
.end method

.method public constructor <init>(Lp42;Lcf4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxs0;->a:I

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 79
    iput-object p1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 80
    iget-object p1, p2, Lcf4;->y:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1c

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 82
    iput p2, p0, Lxs0;->b:I

    const/16 p2, 0x35

    .line 83
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 84
    iput p1, p0, Lxs0;->c:I

    return-void
.end method

.method public static F(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0xd

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x9

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static G(Ljava/io/OutputStream;I)Lxs0;
    .locals 1

    .line 1
    new-instance v0, Lxs0;

    .line 2
    .line 3
    new-array p1, p1, [B

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lxs0;-><init>(Ljava/io/OutputStream;[B)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public static k(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lxs0;->r(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p1}, Lxs0;->m(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    add-int/2addr p1, p0

    .line 10
    return p1
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

.method public static l(II)I
    .locals 0

    .line 1
    invoke-static {p0}, Lxs0;->r(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p1}, Lxs0;->m(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    add-int/2addr p1, p0

    .line 10
    return p1
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

.method public static m(I)I
    .locals 0

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lxs0;->p(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    const/16 p0, 0xa

    .line 9
    .line 10
    return p0
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

.method public static n(ILk2;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lxs0;->r(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p1}, Lxs0;->o(Lk2;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    add-int/2addr p1, p0

    .line 10
    return p1
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

.method public static o(Lk2;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk2;->c()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Lxs0;->p(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
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

.method public static p(I)I
    .locals 1

    .line 1
    and-int/lit8 v0, p0, -0x80

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    and-int/lit16 v0, p0, -0x4000

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    :cond_1
    const/high16 v0, -0x200000

    .line 14
    .line 15
    and-int/2addr v0, p0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x3

    .line 19
    return p0

    .line 20
    :cond_2
    const/high16 v0, -0x10000000

    .line 21
    .line 22
    and-int/2addr p0, v0

    .line 23
    if-nez p0, :cond_3

    .line 24
    .line 25
    const/4 p0, 0x4

    .line 26
    return p0

    .line 27
    :cond_3
    const/4 p0, 0x5

    .line 28
    return p0
    .line 29
.end method

.method public static q(J)I
    .locals 4

    .line 1
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const-wide/16 v0, -0x4000

    .line 13
    .line 14
    and-long/2addr v0, p0

    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    return p0

    .line 21
    :cond_1
    const-wide/32 v0, -0x200000

    .line 22
    .line 23
    .line 24
    and-long/2addr v0, p0

    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    const/4 p0, 0x3

    .line 30
    return p0

    .line 31
    :cond_2
    const-wide/32 v0, -0x10000000

    .line 32
    .line 33
    .line 34
    and-long/2addr v0, p0

    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    const/4 p0, 0x4

    .line 40
    return p0

    .line 41
    :cond_3
    const-wide v0, -0x800000000L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, p0

    .line 47
    cmp-long v0, v0, v2

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    const/4 p0, 0x5

    .line 52
    return p0

    .line 53
    :cond_4
    const-wide v0, -0x40000000000L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    and-long/2addr v0, p0

    .line 59
    cmp-long v0, v0, v2

    .line 60
    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    const/4 p0, 0x6

    .line 64
    return p0

    .line 65
    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    .line 66
    .line 67
    and-long/2addr v0, p0

    .line 68
    cmp-long v0, v0, v2

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    const/4 p0, 0x7

    .line 73
    return p0

    .line 74
    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    .line 75
    .line 76
    and-long/2addr v0, p0

    .line 77
    cmp-long v0, v0, v2

    .line 78
    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    const/16 p0, 0x8

    .line 82
    .line 83
    return p0

    .line 84
    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    .line 85
    .line 86
    and-long/2addr p0, v0

    .line 87
    cmp-long p0, p0, v2

    .line 88
    .line 89
    if-nez p0, :cond_8

    .line 90
    .line 91
    const/16 p0, 0x9

    .line 92
    .line 93
    return p0

    .line 94
    :cond_8
    const/16 p0, 0xa

    .line 95
    .line 96
    return p0
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

.method public static r(I)I
    .locals 0

    .line 1
    shl-int/lit8 p0, p0, 0x3

    .line 2
    .line 3
    invoke-static {p0}, Lxs0;->p(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public A(I)Z
    .locals 2

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget v1, p0, Lxs0;->c:I

    .line 6
    .line 7
    if-gt p1, v1, :cond_0

    .line 8
    .line 9
    if-gt v0, p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-static {p0, p1}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Lb85;->n(I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public B(I)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lxs0;->h(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/text/BreakIterator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->isBoundary(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lxs0;->D(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    add-int/lit8 v0, p1, -0x1

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lxs0;->D(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    add-int/lit8 v0, p1, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lxs0;->D(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x1

    .line 37
    if-lez p1, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/CharSequence;

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sub-int/2addr v1, v0

    .line 48
    if-ge p1, v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lxs0;->C(I)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    add-int/2addr p1, v0

    .line 57
    invoke-virtual {p0, p1}, Lxs0;->C(I)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    :cond_1
    return v0

    .line 64
    :cond_2
    const/4 p0, 0x0

    .line 65
    return p0
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

.method public C(I)Z
    .locals 4

    .line 1
    iget-object p0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    add-int/lit8 v0, p1, -0x1

    .line 6
    .line 7
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Ljava/lang/Character$UnicodeBlock;->HIRAGANA:Ljava/lang/Character$UnicodeBlock;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v3, Ljava/lang/Character$UnicodeBlock;->KATAKANA:Ljava/lang/Character$UnicodeBlock;

    .line 32
    .line 33
    invoke-static {v1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    :cond_0
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object p1, Ljava/lang/Character$UnicodeBlock;->KATAKANA:Ljava/lang/Character$UnicodeBlock;

    .line 62
    .line 63
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    :cond_1
    const/4 p0, 0x1

    .line 70
    return p0

    .line 71
    :cond_2
    const/4 p0, 0x0

    .line 72
    return p0
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public D(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget v1, p0, Lxs0;->b:I

    .line 6
    .line 7
    iget p0, p0, Lxs0;->c:I

    .line 8
    .line 9
    if-ge p1, p0, :cond_2

    .line 10
    .line 11
    if-gt v1, p1, :cond_2

    .line 12
    .line 13
    invoke-static {v0, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {}, Lw22;->d()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    invoke-static {}, Lw22;->a()Lw22;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lw22;->c()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ne v2, v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Lw22;->b(ILjava/lang/CharSequence;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/4 p1, -0x1

    .line 57
    if-eq p0, p1, :cond_2

    .line 58
    .line 59
    :goto_0
    return v1

    .line 60
    :cond_2
    const/4 p0, 0x0

    .line 61
    return p0
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

.method public E(I)Z
    .locals 2

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget v1, p0, Lxs0;->c:I

    .line 4
    .line 5
    if-ge p1, v1, :cond_0

    .line 6
    .line 7
    if-gt v0, p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Lb85;->n(I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public H(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lxs0;->h(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/text/BreakIterator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->following(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    add-int/lit8 v0, p1, -0x1

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lxs0;->D(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lxs0;->D(I)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lxs0;->C(I)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lxs0;->H(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_0
    return p1
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
.end method

.method public I()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget v1, p0, Lxs0;->c:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    add-int/lit8 v2, v0, 0x1

    .line 14
    .line 15
    iput v2, p0, Lxs0;->b:I

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
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

.method public J()F
    .locals 4

    .line 1
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbc4;

    .line 4
    .line 5
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget v2, p0, Lxs0;->b:I

    .line 10
    .line 11
    iget v3, p0, Lxs0;->c:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, v3, v1}, Lbc4;->o(IILjava/lang/String;)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget v0, v0, Lbc4;->x:I

    .line 24
    .line 25
    iput v0, p0, Lxs0;->b:I

    .line 26
    .line 27
    :cond_0
    return v1
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

.method public K()Lpb6;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxs0;->J()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lxs0;->O()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    new-instance p0, Lpb6;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {p0, v1, v0}, Lpb6;-><init>(IF)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance v1, Lpb6;

    .line 27
    .line 28
    invoke-direct {v1, p0, v0}, Lpb6;-><init>(IF)V

    .line 29
    .line 30
    .line 31
    return-object v1
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

.method public L()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxs0;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    iget v1, p0, Lxs0;->b:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0x27

    .line 20
    .line 21
    if-eq v3, v4, :cond_1

    .line 22
    .line 23
    const/16 v4, 0x22

    .line 24
    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_1
    invoke-virtual {p0}, Lxs0;->g()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    :goto_0
    const/4 v5, -0x1

    .line 33
    if-eq v4, v5, :cond_2

    .line 34
    .line 35
    if-eq v4, v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lxs0;->g()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    if-ne v4, v5, :cond_3

    .line 43
    .line 44
    iput v1, p0, Lxs0;->b:I

    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_3
    iget v2, p0, Lxs0;->b:I

    .line 48
    .line 49
    add-int/lit8 v3, v2, 0x1

    .line 50
    .line 51
    iput v3, p0, Lxs0;->b:I

    .line 52
    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public M()Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lxs0;->N(CZ)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
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

.method public N(CZ)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxs0;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v1, p0, Lxs0;->b:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Lxs0;->F(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    :cond_1
    if-ne v1, p1, :cond_3

    .line 27
    .line 28
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_3
    iget v1, p0, Lxs0;->b:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lxs0;->g()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :goto_1
    const/4 v3, -0x1

    .line 37
    if-eq v2, v3, :cond_6

    .line 38
    .line 39
    if-ne v2, p1, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    if-nez p2, :cond_5

    .line 43
    .line 44
    invoke-static {v2}, Lxs0;->F(I)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_5
    invoke-virtual {p0}, Lxs0;->g()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    goto :goto_1

    .line 56
    :cond_6
    :goto_2
    iget p0, p0, Lxs0;->b:I

    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
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

.method public O()I
    .locals 5

    .line 1
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxs0;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    iget v1, p0, Lxs0;->b:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v3, p0, Lxs0;->b:I

    .line 20
    .line 21
    const/16 v4, 0x25

    .line 22
    .line 23
    if-ne v1, v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    iput v3, p0, Lxs0;->b:I

    .line 28
    .line 29
    const/16 p0, 0x9

    .line 30
    .line 31
    return p0

    .line 32
    :cond_1
    iget v1, p0, Lxs0;->c:I

    .line 33
    .line 34
    add-int/lit8 v1, v1, -0x2

    .line 35
    .line 36
    if-le v3, v1, :cond_2

    .line 37
    .line 38
    return v2

    .line 39
    :cond_2
    add-int/lit8 v1, v3, 0x2

    .line 40
    .line 41
    :try_start_0
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Lpb4;->u(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v1, p0, Lxs0;->b:I

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x2

    .line 58
    .line 59
    iput v1, p0, Lxs0;->b:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    return v0

    .line 62
    :catch_0
    return v2
    .line 63
.end method

.method public P()F
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxs0;->T()Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lbc4;

    .line 7
    .line 8
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    iget v2, p0, Lxs0;->b:I

    .line 13
    .line 14
    iget v3, p0, Lxs0;->c:I

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lbc4;->o(IILjava/lang/String;)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget v0, v0, Lbc4;->x:I

    .line 27
    .line 28
    iput v0, p0, Lxs0;->b:I

    .line 29
    .line 30
    :cond_0
    return v1
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

.method public Q(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lxs0;->h(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/text/BreakIterator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->preceding(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lxs0;->D(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lxs0;->z(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lxs0;->C(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lxs0;->Q(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_0
    return p1
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
.end method

.method public R()V
    .locals 4

    .line 1
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/OutputStream;

    .line 4
    .line 5
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [B

    .line 8
    .line 9
    iget v2, p0, Lxs0;->c:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 13
    .line 14
    .line 15
    iput v3, p0, Lxs0;->c:I

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public S(IILjava/lang/String;)V
    .locals 7

    .line 1
    if-gt p1, p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "start index must be less than or equal to end index: "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, " > "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lzb3;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    if-ltz p1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "start must be non-negative, but was "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lzb3;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ltt2;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/lit16 v0, v0, 0x80

    .line 61
    .line 62
    const/16 v2, 0xff

    .line 63
    .line 64
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-array v2, v0, [C

    .line 69
    .line 70
    const/16 v3, 0x40

    .line 71
    .line 72
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    iget-object v5, p0, Lxs0;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    sub-int/2addr v5, p2

    .line 85
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    iget-object v5, p0, Lxs0;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v5, Ljava/lang/String;

    .line 92
    .line 93
    sub-int v6, p1, v4

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v6, p1, v2, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Ljava/lang/String;

    .line 104
    .line 105
    sub-int v5, v0, v3

    .line 106
    .line 107
    add-int/2addr v3, p2

    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2, v3, v2, v5}, Ljava/lang/String;->getChars(II[CI)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-virtual {p3, v1, p1, v2, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 119
    .line 120
    .line 121
    new-instance p1, Ltt2;

    .line 122
    .line 123
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    add-int/2addr p2, v4

    .line 128
    invoke-direct {p1, v1}, Ltt2;-><init>(I)V

    .line 129
    .line 130
    .line 131
    iput v0, p1, Ltt2;->b:I

    .line 132
    .line 133
    iput-object v2, p1, Ltt2;->e:Ljava/lang/Object;

    .line 134
    .line 135
    iput p2, p1, Ltt2;->c:I

    .line 136
    .line 137
    iput v5, p1, Ltt2;->d:I

    .line 138
    .line 139
    iput-object p1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 140
    .line 141
    iput v6, p0, Lxs0;->b:I

    .line 142
    .line 143
    iput v3, p0, Lxs0;->c:I

    .line 144
    .line 145
    return-void

    .line 146
    :cond_2
    iget v2, p0, Lxs0;->b:I

    .line 147
    .line 148
    sub-int v3, p1, v2

    .line 149
    .line 150
    sub-int v2, p2, v2

    .line 151
    .line 152
    if-ltz v3, :cond_8

    .line 153
    .line 154
    iget v4, v0, Ltt2;->b:I

    .line 155
    .line 156
    invoke-virtual {v0}, Ltt2;->d()I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    sub-int/2addr v4, v5

    .line 161
    if-le v2, v4, :cond_3

    .line 162
    .line 163
    goto/16 :goto_5

    .line 164
    .line 165
    :cond_3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    sub-int p1, v2, v3

    .line 170
    .line 171
    sub-int/2addr p0, p1

    .line 172
    invoke-virtual {v0}, Ltt2;->d()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-gt p0, p1, :cond_4

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_4
    invoke-virtual {v0}, Ltt2;->d()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    sub-int/2addr p0, p1

    .line 184
    iget p1, v0, Ltt2;->b:I

    .line 185
    .line 186
    :goto_2
    mul-int/lit8 p1, p1, 0x2

    .line 187
    .line 188
    iget p2, v0, Ltt2;->b:I

    .line 189
    .line 190
    sub-int p2, p1, p2

    .line 191
    .line 192
    if-ge p2, p0, :cond_5

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_5
    new-array p0, p1, [C

    .line 196
    .line 197
    iget-object p2, v0, Ltt2;->e:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p2, [C

    .line 200
    .line 201
    iget v4, v0, Ltt2;->c:I

    .line 202
    .line 203
    invoke-static {p2, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    .line 205
    .line 206
    iget p2, v0, Ltt2;->b:I

    .line 207
    .line 208
    iget v4, v0, Ltt2;->d:I

    .line 209
    .line 210
    sub-int/2addr p2, v4

    .line 211
    sub-int v5, p1, p2

    .line 212
    .line 213
    iget-object v6, v0, Ltt2;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v6, [C

    .line 216
    .line 217
    add-int/2addr p2, v4

    .line 218
    sub-int/2addr p2, v4

    .line 219
    invoke-static {v6, v4, p0, v5, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 220
    .line 221
    .line 222
    iput-object p0, v0, Ltt2;->e:Ljava/lang/Object;

    .line 223
    .line 224
    iput p1, v0, Ltt2;->b:I

    .line 225
    .line 226
    iput v5, v0, Ltt2;->d:I

    .line 227
    .line 228
    :goto_3
    iget p0, v0, Ltt2;->c:I

    .line 229
    .line 230
    if-ge v3, p0, :cond_6

    .line 231
    .line 232
    if-gt v2, p0, :cond_6

    .line 233
    .line 234
    sub-int/2addr p0, v2

    .line 235
    iget-object p1, v0, Ltt2;->e:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p1, [C

    .line 238
    .line 239
    iget p2, v0, Ltt2;->d:I

    .line 240
    .line 241
    sub-int/2addr p2, p0

    .line 242
    invoke-static {p1, v2, p1, p2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 243
    .line 244
    .line 245
    iput v3, v0, Ltt2;->c:I

    .line 246
    .line 247
    iget p1, v0, Ltt2;->d:I

    .line 248
    .line 249
    sub-int/2addr p1, p0

    .line 250
    iput p1, v0, Ltt2;->d:I

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_6
    if-ge v3, p0, :cond_7

    .line 254
    .line 255
    if-lt v2, p0, :cond_7

    .line 256
    .line 257
    invoke-virtual {v0}, Ltt2;->d()I

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    add-int/2addr p0, v2

    .line 262
    iput p0, v0, Ltt2;->d:I

    .line 263
    .line 264
    iput v3, v0, Ltt2;->c:I

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_7
    invoke-virtual {v0}, Ltt2;->d()I

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    add-int/2addr p0, v3

    .line 272
    invoke-virtual {v0}, Ltt2;->d()I

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    add-int/2addr p1, v2

    .line 277
    iget p2, v0, Ltt2;->d:I

    .line 278
    .line 279
    sub-int/2addr p0, p2

    .line 280
    iget-object v2, v0, Ltt2;->e:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v2, [C

    .line 283
    .line 284
    iget v3, v0, Ltt2;->c:I

    .line 285
    .line 286
    invoke-static {v2, p2, v2, v3, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 287
    .line 288
    .line 289
    iget p2, v0, Ltt2;->c:I

    .line 290
    .line 291
    add-int/2addr p2, p0

    .line 292
    iput p2, v0, Ltt2;->c:I

    .line 293
    .line 294
    iput p1, v0, Ltt2;->d:I

    .line 295
    .line 296
    :goto_4
    iget-object p0, v0, Ltt2;->e:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast p0, [C

    .line 299
    .line 300
    iget p1, v0, Ltt2;->c:I

    .line 301
    .line 302
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    invoke-virtual {p3, v1, p2, p0, p1}, Ljava/lang/String;->getChars(II[CI)V

    .line 307
    .line 308
    .line 309
    iget p0, v0, Ltt2;->c:I

    .line 310
    .line 311
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    add-int/2addr p1, p0

    .line 316
    iput p1, v0, Ltt2;->c:I

    .line 317
    .line 318
    return-void

    .line 319
    :cond_8
    :goto_5
    invoke-virtual {p0}, Lxs0;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    iput-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 324
    .line 325
    const/4 v0, 0x0

    .line 326
    iput-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 327
    .line 328
    const/4 v0, -0x1

    .line 329
    iput v0, p0, Lxs0;->b:I

    .line 330
    .line 331
    iput v0, p0, Lxs0;->c:I

    .line 332
    .line 333
    invoke-virtual {p0, p1, p2, p3}, Lxs0;->S(IILjava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-void
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method

.method public T()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxs0;->U()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lxs0;->b:I

    .line 5
    .line 6
    iget v1, p0, Lxs0;->c:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x2c

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    return v2

    .line 25
    :cond_1
    iget v0, p0, Lxs0;->b:I

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    add-int/2addr v0, v1

    .line 29
    iput v0, p0, Lxs0;->b:I

    .line 30
    .line 31
    invoke-virtual {p0}, Lxs0;->U()V

    .line 32
    .line 33
    .line 34
    return v1
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

.method public U()V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget v1, p0, Lxs0;->c:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Lxs0;->F(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget v0, p0, Lxs0;->b:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iput v0, p0, Lxs0;->b:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return-void
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

.method public V(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lxs0;->h0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lxs0;->X(I)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public W(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lxs0;->h0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lxs0;->X(I)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public X(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxs0;->f0(I)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    int-to-long v0, p1

    .line 8
    invoke-virtual {p0, v0, v1}, Lxs0;->g0(J)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public Y(ILk2;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, p1, v0}, Lxs0;->h0(II)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lxs0;->Z(Lk2;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public Z(Lk2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lk2;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lxs0;->f0(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lk2;->f(Lxs0;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public a(FFFF)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lxs0;->f(B)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    invoke-virtual {p0, v0}, Lxs0;->u(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [F

    .line 12
    .line 13
    iget v2, p0, Lxs0;->c:I

    .line 14
    .line 15
    add-int/lit8 v3, v2, 0x1

    .line 16
    .line 17
    iput v3, p0, Lxs0;->c:I

    .line 18
    .line 19
    aput p1, v1, v2

    .line 20
    .line 21
    add-int/lit8 p1, v2, 0x2

    .line 22
    .line 23
    iput p1, p0, Lxs0;->c:I

    .line 24
    .line 25
    aput p2, v1, v3

    .line 26
    .line 27
    add-int/lit8 p2, v2, 0x3

    .line 28
    .line 29
    iput p2, p0, Lxs0;->c:I

    .line 30
    .line 31
    aput p3, v1, p1

    .line 32
    .line 33
    add-int/2addr v2, v0

    .line 34
    iput v2, p0, Lxs0;->c:I

    .line 35
    .line 36
    aput p4, v1, p2

    .line 37
    .line 38
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public a0(I)V
    .locals 3

    .line 1
    int-to-byte p1, p1

    .line 2
    iget v0, p0, Lxs0;->c:I

    .line 3
    .line 4
    iget v1, p0, Lxs0;->b:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lxs0;->R()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, [B

    .line 14
    .line 15
    iget v1, p0, Lxs0;->c:I

    .line 16
    .line 17
    add-int/lit8 v2, v1, 0x1

    .line 18
    .line 19
    iput v2, p0, Lxs0;->c:I

    .line 20
    .line 21
    aput-byte p1, v0, v1

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public b(FF)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lxs0;->f(B)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-virtual {p0, v0}, Lxs0;->u(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [F

    .line 12
    .line 13
    iget v2, p0, Lxs0;->c:I

    .line 14
    .line 15
    add-int/lit8 v3, v2, 0x1

    .line 16
    .line 17
    iput v3, p0, Lxs0;->c:I

    .line 18
    .line 19
    aput p1, v1, v2

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    iput v2, p0, Lxs0;->c:I

    .line 23
    .line 24
    aput p2, v1, v3

    .line 25
    .line 26
    return-void
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

.method public b0(Lbg0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lbg0;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lxs0;->b:I

    .line 6
    .line 7
    iget v2, p0, Lxs0;->c:I

    .line 8
    .line 9
    sub-int v3, v1, v2

    .line 10
    .line 11
    iget-object v4, p0, Lxs0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, [B

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-lt v3, v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v5, v2, v0, v4}, Lbg0;->g(III[B)V

    .line 19
    .line 20
    .line 21
    iget p1, p0, Lxs0;->c:I

    .line 22
    .line 23
    add-int/2addr p1, v0

    .line 24
    iput p1, p0, Lxs0;->c:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p1, v5, v2, v3, v4}, Lbg0;->g(III[B)V

    .line 28
    .line 29
    .line 30
    sub-int/2addr v0, v3

    .line 31
    iput v1, p0, Lxs0;->c:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lxs0;->R()V

    .line 34
    .line 35
    .line 36
    if-gt v0, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v3, v5, v0, v4}, Lbg0;->g(III[B)V

    .line 39
    .line 40
    .line 41
    iput v0, p0, Lxs0;->c:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object p0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Ljava/io/OutputStream;

    .line 47
    .line 48
    if-ltz v3, :cond_5

    .line 49
    .line 50
    if-ltz v0, :cond_4

    .line 51
    .line 52
    add-int v1, v3, v0

    .line 53
    .line 54
    invoke-virtual {p1}, Lbg0;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-gt v1, v2, :cond_3

    .line 59
    .line 60
    if-lez v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1, p0, v3, v0}, Lbg0;->A(Ljava/io/OutputStream;II)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void

    .line 66
    :cond_3
    const/16 p0, 0x27

    .line 67
    .line 68
    const-string p1, "Source end offset exceeded: "

    .line 69
    .line 70
    invoke-static {p0, v1, p1}, Lh;->g(IILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    const/16 p0, 0x17

    .line 75
    .line 76
    const-string p1, "Length < 0: "

    .line 77
    .line 78
    invoke-static {p0, v0, p1}, Lh;->g(IILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    const/16 p0, 0x1e

    .line 83
    .line 84
    const-string p1, "Source offset < 0: "

    .line 85
    .line 86
    invoke-static {p0, v3, p1}, Lh;->g(IILjava/lang/Object;)V

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

.method public c(FFFFFF)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lxs0;->f(B)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x6

    .line 6
    invoke-virtual {p0, v0}, Lxs0;->u(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [F

    .line 12
    .line 13
    iget v2, p0, Lxs0;->c:I

    .line 14
    .line 15
    add-int/lit8 v3, v2, 0x1

    .line 16
    .line 17
    iput v3, p0, Lxs0;->c:I

    .line 18
    .line 19
    aput p1, v1, v2

    .line 20
    .line 21
    add-int/lit8 p1, v2, 0x2

    .line 22
    .line 23
    iput p1, p0, Lxs0;->c:I

    .line 24
    .line 25
    aput p2, v1, v3

    .line 26
    .line 27
    add-int/lit8 p2, v2, 0x3

    .line 28
    .line 29
    iput p2, p0, Lxs0;->c:I

    .line 30
    .line 31
    aput p3, v1, p1

    .line 32
    .line 33
    add-int/lit8 p1, v2, 0x4

    .line 34
    .line 35
    iput p1, p0, Lxs0;->c:I

    .line 36
    .line 37
    aput p4, v1, p2

    .line 38
    .line 39
    add-int/lit8 p2, v2, 0x5

    .line 40
    .line 41
    iput p2, p0, Lxs0;->c:I

    .line 42
    .line 43
    aput p5, v1, p1

    .line 44
    .line 45
    add-int/2addr v2, v0

    .line 46
    iput v2, p0, Lxs0;->c:I

    .line 47
    .line 48
    aput p6, v1, p2

    .line 49
    .line 50
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
.end method

.method public c0([B)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, Lxs0;->b:I

    .line 3
    .line 4
    iget v2, p0, Lxs0;->c:I

    .line 5
    .line 6
    sub-int v3, v1, v2

    .line 7
    .line 8
    iget-object v4, p0, Lxs0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v4, [B

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-lt v3, v0, :cond_0

    .line 14
    .line 15
    invoke-static {p1, v5, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lxs0;->c:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lxs0;->c:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {p1, v5, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    sub-int/2addr v0, v3

    .line 28
    iput v1, p0, Lxs0;->c:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lxs0;->R()V

    .line 31
    .line 32
    .line 33
    if-gt v0, v1, :cond_1

    .line 34
    .line 35
    invoke-static {p1, v3, v4, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    iput v0, p0, Lxs0;->c:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object p0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ljava/io/OutputStream;

    .line 44
    .line 45
    invoke-virtual {p0, p1, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void
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

.method public close()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxs0;->f(B)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public d(FFFZZFF)V
    .locals 2

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const/4 p4, 0x2

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p4, 0x0

    .line 6
    :goto_0
    or-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    or-int/2addr p4, p5

    .line 9
    int-to-byte p4, p4

    .line 10
    invoke-virtual {p0, p4}, Lxs0;->f(B)V

    .line 11
    .line 12
    .line 13
    const/4 p4, 0x5

    .line 14
    invoke-virtual {p0, p4}, Lxs0;->u(I)V

    .line 15
    .line 16
    .line 17
    iget-object p5, p0, Lxs0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p5, [F

    .line 20
    .line 21
    iget v0, p0, Lxs0;->c:I

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0x1

    .line 24
    .line 25
    iput v1, p0, Lxs0;->c:I

    .line 26
    .line 27
    aput p1, p5, v0

    .line 28
    .line 29
    add-int/lit8 p1, v0, 0x2

    .line 30
    .line 31
    iput p1, p0, Lxs0;->c:I

    .line 32
    .line 33
    aput p2, p5, v1

    .line 34
    .line 35
    add-int/lit8 p2, v0, 0x3

    .line 36
    .line 37
    iput p2, p0, Lxs0;->c:I

    .line 38
    .line 39
    aput p3, p5, p1

    .line 40
    .line 41
    add-int/lit8 p1, v0, 0x4

    .line 42
    .line 43
    iput p1, p0, Lxs0;->c:I

    .line 44
    .line 45
    aput p6, p5, p2

    .line 46
    .line 47
    add-int/2addr v0, p4

    .line 48
    iput v0, p0, Lxs0;->c:I

    .line 49
    .line 50
    aput p7, p5, p1

    .line 51
    .line 52
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
.end method

.method public d0(I)V
    .locals 1

    .line 1
    and-int/lit16 v0, p1, 0xff

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 4
    .line 5
    .line 6
    shr-int/lit8 v0, p1, 0x8

    .line 7
    .line 8
    and-int/lit16 v0, v0, 0xff

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 11
    .line 12
    .line 13
    shr-int/lit8 v0, p1, 0x10

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 18
    .line 19
    .line 20
    shr-int/lit8 p1, p1, 0x18

    .line 21
    .line 22
    and-int/lit16 p1, p1, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lxs0;->a0(I)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method

.method public e(FF)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lxs0;->f(B)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-virtual {p0, v0}, Lxs0;->u(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [F

    .line 12
    .line 13
    iget v2, p0, Lxs0;->c:I

    .line 14
    .line 15
    add-int/lit8 v3, v2, 0x1

    .line 16
    .line 17
    iput v3, p0, Lxs0;->c:I

    .line 18
    .line 19
    aput p1, v1, v2

    .line 20
    .line 21
    add-int/2addr v2, v0

    .line 22
    iput v2, p0, Lxs0;->c:I

    .line 23
    .line 24
    aput p2, v1, v3

    .line 25
    .line 26
    return-void
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

.method public e0(J)V
    .locals 2

    .line 1
    long-to-int v0, p1

    .line 2
    and-int/lit16 v0, v0, 0xff

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    shr-long v0, p1, v0

    .line 10
    .line 11
    long-to-int v0, v0

    .line 12
    and-int/lit16 v0, v0, 0xff

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 15
    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    shr-long v0, p1, v0

    .line 20
    .line 21
    long-to-int v0, v0

    .line 22
    and-int/lit16 v0, v0, 0xff

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 25
    .line 26
    .line 27
    const/16 v0, 0x18

    .line 28
    .line 29
    shr-long v0, p1, v0

    .line 30
    .line 31
    long-to-int v0, v0

    .line 32
    and-int/lit16 v0, v0, 0xff

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 35
    .line 36
    .line 37
    const/16 v0, 0x20

    .line 38
    .line 39
    shr-long v0, p1, v0

    .line 40
    .line 41
    long-to-int v0, v0

    .line 42
    and-int/lit16 v0, v0, 0xff

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x28

    .line 48
    .line 49
    shr-long v0, p1, v0

    .line 50
    .line 51
    long-to-int v0, v0

    .line 52
    and-int/lit16 v0, v0, 0xff

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x30

    .line 58
    .line 59
    shr-long v0, p1, v0

    .line 60
    .line 61
    long-to-int v0, v0

    .line 62
    and-int/lit16 v0, v0, 0xff

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x38

    .line 68
    .line 69
    shr-long/2addr p1, v0

    .line 70
    long-to-int p1, p1

    .line 71
    and-int/lit16 p1, p1, 0xff

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lxs0;->a0(I)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public f(B)V
    .locals 4

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [B

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    array-length v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    new-array v0, v0, [B

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, [B

    .line 25
    .line 26
    iget v1, p0, Lxs0;->b:I

    .line 27
    .line 28
    add-int/lit8 v2, v1, 0x1

    .line 29
    .line 30
    iput v2, p0, Lxs0;->b:I

    .line 31
    .line 32
    aput-byte p1, v0, v1

    .line 33
    .line 34
    return-void
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
.end method

.method public f0(I)V
    .locals 1

    .line 1
    :goto_0
    and-int/lit8 v0, p1, -0x80

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lxs0;->a0(I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    and-int/lit8 v0, p1, 0x7f

    .line 10
    .line 11
    or-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 14
    .line 15
    .line 16
    ushr-int/lit8 p1, p1, 0x7

    .line 17
    .line 18
    goto :goto_0
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

.method public g()I
    .locals 3

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget v1, p0, Lxs0;->c:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput v0, p0, Lxs0;->b:I

    .line 12
    .line 13
    if-ge v0, v1, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    return v2
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
.end method

.method public g0(J)V
    .locals 4

    .line 1
    :goto_0
    const-wide/16 v0, -0x80

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    long-to-int p1, p1

    .line 11
    invoke-virtual {p0, p1}, Lxs0;->a0(I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    long-to-int v0, p1

    .line 16
    and-int/lit8 v0, v0, 0x7f

    .line 17
    .line 18
    or-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lxs0;->a0(I)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x7

    .line 24
    ushr-long/2addr p1, v0

    .line 25
    goto :goto_0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public h(I)V
    .locals 4

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget p0, p0, Lxs0;->c:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-gt p1, p0, :cond_0

    .line 7
    .line 8
    if-gt v0, p1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :cond_0
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v1, ". Valid range is ["

    .line 14
    .line 15
    const-string v2, " , "

    .line 16
    .line 17
    const-string v3, "Invalid offset: "

    .line 18
    .line 19
    invoke-static {v3, p1, v1, v0, v2}, Lpb4;->p(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, "]"

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lzb3;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
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
.end method

.method public h0(II)V
    .locals 0

    .line 1
    shl-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    or-int/2addr p1, p2

    .line 4
    invoke-virtual {p0, p1}, Lxs0;->f0(I)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public i(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lxs0;->T()Z

    .line 5
    .line 6
    .line 7
    iget p1, p0, Lxs0;->b:I

    .line 8
    .line 9
    iget v0, p0, Lxs0;->c:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 v0, 0x30

    .line 23
    .line 24
    const/16 v1, 0x31

    .line 25
    .line 26
    if-eq p1, v0, :cond_3

    .line 27
    .line 28
    if-ne p1, v1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_3
    :goto_1
    iget v0, p0, Lxs0;->b:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    add-int/2addr v0, v2

    .line 37
    iput v0, p0, Lxs0;->b:I

    .line 38
    .line 39
    if-ne p1, v1, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    const/4 v2, 0x0

    .line 43
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
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

.method public j(F)F
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lxs0;->T()Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lxs0;->J()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
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

.method public s(C)Z
    .locals 3

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget v1, p0, Lxs0;->c:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, p1, :cond_0

    .line 17
    .line 18
    move p1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget v0, p0, Lxs0;->b:I

    .line 24
    .line 25
    add-int/2addr v0, v2

    .line 26
    iput v0, p0, Lxs0;->b:I

    .line 27
    .line 28
    :cond_1
    return p1
    .line 29
.end method

.method public t(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lxs0;->b:I

    .line 6
    .line 7
    iget v2, p0, Lxs0;->c:I

    .line 8
    .line 9
    sub-int/2addr v2, v0

    .line 10
    if-gt v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lxs0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    add-int v3, v1, v0

    .line 17
    .line 18
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget v1, p0, Lxs0;->b:I

    .line 34
    .line 35
    add-int/2addr v1, v0

    .line 36
    iput v1, p0, Lxs0;->b:I

    .line 37
    .line 38
    :cond_1
    return p1
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
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lxs0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ltt2;

    .line 14
    .line 15
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    iget v3, p0, Lxs0;->b:I

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-virtual {v2, v1, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, Ltt2;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, [C

    .line 36
    .line 37
    iget v3, v0, Ltt2;->c:I

    .line 38
    .line 39
    invoke-virtual {v2, v1, v4, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Ltt2;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, [C

    .line 45
    .line 46
    iget v3, v0, Ltt2;->d:I

    .line 47
    .line 48
    iget v0, v0, Ltt2;->b:I

    .line 49
    .line 50
    sub-int/2addr v0, v3

    .line 51
    invoke-virtual {v2, v1, v3, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    iget p0, p0, Lxs0;->c:I

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {v2, v0, p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_0
    return-object v1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
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

.method public u(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [F

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    iget v2, p0, Lxs0;->c:I

    .line 7
    .line 8
    add-int/2addr v2, p1

    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    array-length p1, v0

    .line 12
    mul-int/lit8 p1, p1, 0x2

    .line 13
    .line 14
    new-array p1, p1, [F

    .line 15
    .line 16
    array-length v1, v0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public v()Z
    .locals 1

    .line 1
    iget v0, p0, Lxs0;->b:I

    .line 2
    .line 3
    iget p0, p0, Lxs0;->c:I

    .line 4
    .line 5
    if-ne v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
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

.method public w(Lwb6;)V
    .locals 12

    .line 1
    const/4 v8, 0x0

    .line 2
    move v0, v8

    .line 3
    move v9, v0

    .line 4
    :goto_0
    iget v1, p0, Lxs0;->b:I

    .line 5
    .line 6
    if-ge v9, v1, :cond_7

    .line 7
    .line 8
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [B

    .line 11
    .line 12
    aget-byte v1, v1, v9

    .line 13
    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq v1, v2, :cond_5

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-eq v1, v3, :cond_4

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    if-eq v1, v3, :cond_3

    .line 24
    .line 25
    const/16 v3, 0x8

    .line 26
    .line 27
    if-eq v1, v3, :cond_2

    .line 28
    .line 29
    and-int/lit8 v3, v1, 0x2

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    move v4, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v4, v8

    .line 36
    :goto_1
    and-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    move v5, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    move v5, v8

    .line 43
    :goto_2
    iget-object v1, p0, Lxs0;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, [F

    .line 46
    .line 47
    add-int/lit8 v2, v0, 0x1

    .line 48
    .line 49
    move-object v3, v1

    .line 50
    aget v1, v3, v0

    .line 51
    .line 52
    add-int/lit8 v6, v0, 0x2

    .line 53
    .line 54
    aget v2, v3, v2

    .line 55
    .line 56
    add-int/lit8 v7, v0, 0x3

    .line 57
    .line 58
    aget v6, v3, v6

    .line 59
    .line 60
    add-int/lit8 v10, v0, 0x4

    .line 61
    .line 62
    aget v7, v3, v7

    .line 63
    .line 64
    add-int/lit8 v11, v0, 0x5

    .line 65
    .line 66
    aget v0, v3, v10

    .line 67
    .line 68
    move v3, v6

    .line 69
    move v6, v7

    .line 70
    move v7, v0

    .line 71
    move-object v0, p1

    .line 72
    invoke-interface/range {v0 .. v7}, Lwb6;->d(FFFZZFF)V

    .line 73
    .line 74
    .line 75
    move v0, v11

    .line 76
    goto :goto_3

    .line 77
    :cond_2
    invoke-interface {p1}, Lwb6;->close()V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    iget-object v2, p0, Lxs0;->e:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, [F

    .line 84
    .line 85
    add-int/lit8 v3, v0, 0x1

    .line 86
    .line 87
    aget v4, v2, v0

    .line 88
    .line 89
    add-int/lit8 v5, v0, 0x2

    .line 90
    .line 91
    aget v3, v2, v3

    .line 92
    .line 93
    add-int/lit8 v6, v0, 0x3

    .line 94
    .line 95
    aget v5, v2, v5

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x4

    .line 98
    .line 99
    aget v2, v2, v6

    .line 100
    .line 101
    invoke-interface {p1, v4, v3, v5, v2}, Lwb6;->a(FFFF)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    iget-object v2, p0, Lxs0;->e:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, [F

    .line 108
    .line 109
    add-int/lit8 v3, v0, 0x1

    .line 110
    .line 111
    aget v1, v2, v0

    .line 112
    .line 113
    add-int/lit8 v4, v0, 0x2

    .line 114
    .line 115
    aget v3, v2, v3

    .line 116
    .line 117
    add-int/lit8 v5, v0, 0x3

    .line 118
    .line 119
    aget v4, v2, v4

    .line 120
    .line 121
    add-int/lit8 v6, v0, 0x4

    .line 122
    .line 123
    aget v5, v2, v5

    .line 124
    .line 125
    add-int/lit8 v7, v0, 0x5

    .line 126
    .line 127
    aget v6, v2, v6

    .line 128
    .line 129
    add-int/lit8 v10, v0, 0x6

    .line 130
    .line 131
    aget v0, v2, v7

    .line 132
    .line 133
    move v2, v3

    .line 134
    move v3, v4

    .line 135
    move v4, v5

    .line 136
    move v5, v6

    .line 137
    move v6, v0

    .line 138
    move-object v0, p1

    .line 139
    invoke-interface/range {v0 .. v6}, Lwb6;->c(FFFFFF)V

    .line 140
    .line 141
    .line 142
    move v0, v10

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    iget-object v2, p0, Lxs0;->e:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v2, [F

    .line 147
    .line 148
    add-int/lit8 v3, v0, 0x1

    .line 149
    .line 150
    aget v4, v2, v0

    .line 151
    .line 152
    add-int/lit8 v0, v0, 0x2

    .line 153
    .line 154
    aget v2, v2, v3

    .line 155
    .line 156
    invoke-interface {p1, v4, v2}, Lwb6;->e(FF)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_6
    iget-object v2, p0, Lxs0;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, [F

    .line 163
    .line 164
    add-int/lit8 v3, v0, 0x1

    .line 165
    .line 166
    aget v4, v2, v0

    .line 167
    .line 168
    add-int/lit8 v0, v0, 0x2

    .line 169
    .line 170
    aget v2, v2, v3

    .line 171
    .line 172
    invoke-interface {p1, v4, v2}, Lwb6;->b(FF)V

    .line 173
    .line 174
    .line 175
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_7
    return-void
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public x()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxs0;->R()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public y()I
    .locals 3

    .line 1
    iget-object v0, p0, Lxs0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltt2;

    .line 4
    .line 5
    iget-object v1, p0, Lxs0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget v2, p0, Lxs0;->c:I

    .line 21
    .line 22
    iget p0, p0, Lxs0;->b:I

    .line 23
    .line 24
    sub-int/2addr v2, p0

    .line 25
    sub-int/2addr v1, v2

    .line 26
    iget p0, v0, Ltt2;->b:I

    .line 27
    .line 28
    invoke-virtual {v0}, Ltt2;->d()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr p0, v0

    .line 33
    add-int/2addr p0, v1

    .line 34
    return p0
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

.method public z(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lxs0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget v1, p0, Lxs0;->b:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    add-int/2addr v1, v2

    .line 9
    iget p0, p0, Lxs0;->c:I

    .line 10
    .line 11
    if-gt p1, p0, :cond_2

    .line 12
    .line 13
    if-gt v1, p1, :cond_2

    .line 14
    .line 15
    invoke-static {v0, p1}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {p0}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sub-int/2addr p1, v2

    .line 27
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {}, Lw22;->d()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-static {}, Lw22;->a()Lw22;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Lw22;->c()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-ne v1, v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, p1, v0}, Lw22;->b(ILjava/lang/CharSequence;)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/4 p1, -0x1

    .line 59
    if-eq p0, p1, :cond_2

    .line 60
    .line 61
    :goto_0
    return v2

    .line 62
    :cond_2
    const/4 p0, 0x0

    .line 63
    return p0
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
