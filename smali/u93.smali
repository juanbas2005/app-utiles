.class public final Lu93;
.super Li93;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final d:Ler4;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Li93;-><init>(I)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Ler4;->w:Ler4;

    .line 6
    .line 7
    iput-object v0, p0, Lu93;->d:Ler4;

    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final e()Lp36;
    .locals 8

    .line 1
    iget-object v0, p0, Li93;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Li93;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lu93;->d:Ler4;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    sget-object v0, Ler4;->w:Ler4;

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    new-instance v0, Lp36;

    .line 15
    .line 16
    sget-object v1, Li36;->A:Li36;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lp36;-><init>(Lq93;Ljava/util/Comparator;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    sget-object v0, Lp36;->D:Lp36;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {v1, v0}, Lp25;->d(I[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v0, v4, v1, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 30
    .line 31
    .line 32
    move v4, v3

    .line 33
    move v5, v4

    .line 34
    :goto_0
    if-ge v4, v1, :cond_3

    .line 35
    .line 36
    aget-object v6, v0, v4

    .line 37
    .line 38
    add-int/lit8 v7, v5, -0x1

    .line 39
    .line 40
    aget-object v7, v0, v7

    .line 41
    .line 42
    invoke-virtual {v2, v6, v7}, Ler4;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    add-int/lit8 v7, v5, 0x1

    .line 49
    .line 50
    aput-object v6, v0, v5

    .line 51
    .line 52
    move v5, v7

    .line 53
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const/4 v4, 0x0

    .line 57
    invoke-static {v0, v5, v1, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    array-length v1, v0

    .line 61
    div-int/lit8 v1, v1, 0x2

    .line 62
    .line 63
    if-ge v5, v1, :cond_4

    .line 64
    .line 65
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :cond_4
    new-instance v1, Lp36;

    .line 70
    .line 71
    invoke-static {v5, v0}, Lq93;->p(I[Ljava/lang/Object;)Li36;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-direct {v1, v0, v2}, Lp36;-><init>(Lq93;Ljava/util/Comparator;)V

    .line 76
    .line 77
    .line 78
    move-object v0, v1

    .line 79
    :goto_1
    iget-object v1, v0, Lp36;->C:Lq93;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput v1, p0, Li93;->b:I

    .line 86
    .line 87
    iput-boolean v3, p0, Li93;->a:Z

    .line 88
    .line 89
    return-object v0
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
