.class public final Lq06;
.super Lo06;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final b:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Luq4;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lo06;-><init>(Luq4;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lq06;->b:[Ljava/lang/Object;

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
.method public final a()Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lq06;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    array-length v1, p0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_4

    .line 12
    .line 13
    aget-object v3, p0, v2

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    sget-object v5, Lm06;->a:Ljava/util/List;

    .line 23
    .line 24
    const-class v5, Ljava/lang/Enum;

    .line 25
    .line 26
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    new-instance v4, Ld16;

    .line 34
    .line 35
    check-cast v3, Ljava/lang/Enum;

    .line 36
    .line 37
    invoke-direct {v4, v5, v3}, Ld16;-><init>(Luq4;Ljava/lang/Enum;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    instance-of v4, v3, Ljava/lang/annotation/Annotation;

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    new-instance v4, Lp06;

    .line 46
    .line 47
    check-cast v3, Ljava/lang/annotation/Annotation;

    .line 48
    .line 49
    invoke-direct {v4, v5, v3}, Lp06;-><init>(Luq4;Ljava/lang/annotation/Annotation;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    instance-of v4, v3, [Ljava/lang/Object;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    new-instance v4, Lq06;

    .line 58
    .line 59
    check-cast v3, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-direct {v4, v5, v3}, Lq06;-><init>(Luq4;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    instance-of v4, v3, Ljava/lang/Class;

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    new-instance v4, Lz06;

    .line 70
    .line 71
    check-cast v3, Ljava/lang/Class;

    .line 72
    .line 73
    invoke-direct {v4, v5, v3}, Lz06;-><init>(Luq4;Ljava/lang/Class;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    new-instance v4, Lf16;

    .line 78
    .line 79
    invoke-direct {v4, v5, v3}, Lf16;-><init>(Luq4;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return-object v0
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
