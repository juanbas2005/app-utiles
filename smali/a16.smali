.class public final La16;
.super Ll16;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/lang/reflect/Type;

.field public final b:Lgi3;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La16;->a:Ljava/lang/reflect/Type;

    .line 8
    .line 9
    instance-of v0, p1, Ljava/lang/Class;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lx06;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/Class;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lx06;-><init>(Ljava/lang/Class;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Lm16;

    .line 26
    .line 27
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lm16;-><init>(Ljava/lang/reflect/TypeVariable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Lx06;

    .line 38
    .line 39
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast p1, Ljava/lang/Class;

    .line 49
    .line 50
    invoke-direct {v0, p1}, Lx06;-><init>(Ljava/lang/Class;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iput-object v0, p0, La16;->b:Lgi3;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string v0, "): "

    .line 61
    .line 62
    const-string v1, "Not a classifier type ("

    .line 63
    .line 64
    invoke-static {v1, p0, v0, p1}, Lku4;->A(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
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
.method public final a(Lup2;)Ln06;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final b()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, La16;->a:Ljava/lang/reflect/Type;

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

.method public final c()Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object p0, p0, La16;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    invoke-static {p0}, Lm06;->c(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-static {p0, v1}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/reflect/Type;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    instance-of v2, v1, Ljava/lang/Class;

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    move-object v3, v1

    .line 42
    check-cast v3, Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    new-instance v1, Lj16;

    .line 51
    .line 52
    invoke-direct {v1, v3}, Lj16;-><init>(Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_0
    instance-of v3, v1, Ljava/lang/reflect/GenericArrayType;

    .line 57
    .line 58
    if-nez v3, :cond_3

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    move-object v2, v1

    .line 63
    check-cast v2, Ljava/lang/Class;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    instance-of v2, v1, Ljava/lang/reflect/WildcardType;

    .line 73
    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    new-instance v2, Lo16;

    .line 77
    .line 78
    check-cast v1, Ljava/lang/reflect/WildcardType;

    .line 79
    .line 80
    invoke-direct {v2, v1}, Lo16;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    move-object v1, v2

    .line 84
    goto :goto_3

    .line 85
    :cond_2
    new-instance v2, La16;

    .line 86
    .line 87
    invoke-direct {v2, v1}, La16;-><init>(Ljava/lang/reflect/Type;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    :goto_2
    new-instance v2, Lr06;

    .line 92
    .line 93
    invoke-direct {v2, v1}, Lr06;-><init>(Ljava/lang/reflect/Type;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :goto_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    return-object v0
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

.method public final d()Z
    .locals 2

    .line 1
    iget-object p0, p0, La16;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p0, Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    array-length p0, p0

    .line 18
    const/4 v0, 0x1

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    move p0, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p0, v1

    .line 24
    :goto_0
    if-nez p0, :cond_1

    .line 25
    .line 26
    return v0

    .line 27
    :cond_1
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

.method public final getAnnotations()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, La42;->w:La42;

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
