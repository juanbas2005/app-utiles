.class public final synthetic Landroidx/savedstate/serialization/serializers/b;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# instance fields
.field public final synthetic a:Lzr3;

.field private final descriptor:Lll6;


# direct methods
.method public constructor <init>(Lzr3;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lik5;

    .line 5
    .line 6
    const-string v1, "androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate"

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v0, v1, p0, v2}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 10
    .line 11
    .line 12
    const-string v1, "keys"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v1, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    const-string v1, "values"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lik5;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/savedstate/serialization/serializers/b;->descriptor:Lll6;

    .line 24
    .line 25
    iput-object p1, p0, Landroidx/savedstate/serialization/serializers/b;->a:Lzr3;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 3

    .line 1
    invoke-static {}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    new-array v1, v1, [Lzr3;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget-object v0, v0, v2

    .line 10
    .line 11
    invoke-interface {v0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    aput-object v0, v1, v2

    .line 16
    .line 17
    new-instance v0, Lcs;

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/savedstate/serialization/serializers/b;->a:Lzr3;

    .line 20
    .line 21
    invoke-direct {v0, p0, v2}, Lcs;-><init>(Lzr3;I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    aput-object v0, v1, p0

    .line 26
    .line 27
    return-object v1
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

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/savedstate/serialization/serializers/b;->descriptor:Lll6;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lok1;->c(Lll6;)Lgy0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;->access$get$childSerializers$cp()[Lnz3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move v5, v2

    .line 15
    move v6, v3

    .line 16
    move-object v7, v4

    .line 17
    move-object v8, v7

    .line 18
    :goto_0
    if-eqz v5, :cond_3

    .line 19
    .line 20
    invoke-interface {p1, v0}, Lgy0;->h(Lll6;)I

    .line 21
    .line 22
    .line 23
    move-result v9

    .line 24
    const/4 v10, -0x1

    .line 25
    if-eq v9, v10, :cond_2

    .line 26
    .line 27
    if-eqz v9, :cond_1

    .line 28
    .line 29
    if-ne v9, v2, :cond_0

    .line 30
    .line 31
    new-instance v9, Lcs;

    .line 32
    .line 33
    iget-object v10, p0, Landroidx/savedstate/serialization/serializers/b;->a:Lzr3;

    .line 34
    .line 35
    invoke-direct {v9, v10, v3}, Lcs;-><init>(Lzr3;I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v0, v2, v9, v8}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    check-cast v8, Ljava/util/List;

    .line 43
    .line 44
    or-int/lit8 v6, v6, 0x2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v9}, Lh;->e(I)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_1
    aget-object v9, v1, v3

    .line 52
    .line 53
    invoke-interface {v9}, Lnz3;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    check-cast v9, Lzr3;

    .line 58
    .line 59
    invoke-interface {p1, v0, v3, v9, v7}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    check-cast v7, Ljava/util/List;

    .line 64
    .line 65
    or-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v5, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-interface {p1, v0}, Lgy0;->b(Lll6;)V

    .line 71
    .line 72
    .line 73
    new-instance p0, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;

    .line 74
    .line 75
    invoke-direct {p0, v6, v7, v8, v4}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;-><init>(ILjava/util/List;Ljava/util/List;Lrl6;)V

    .line 76
    .line 77
    .line 78
    return-object p0
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
.end method

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/savedstate/serialization/serializers/b;->descriptor:Lll6;

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

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/savedstate/serialization/serializers/b;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p0, p0, Landroidx/savedstate/serialization/serializers/b;->a:Lzr3;

    .line 13
    .line 14
    invoke-static {p2, p1, v0, p0}, Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;->write$Self$savedstate(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Lhy0;Lll6;Lzr3;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0}, Lhy0;->b(Lll6;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final typeParametersSerializers()[Lzr3;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lzr3;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, Landroidx/savedstate/serialization/serializers/b;->a:Lzr3;

    .line 6
    .line 7
    aput-object p0, v0, v1

    .line 8
    .line 9
    return-object v0
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
