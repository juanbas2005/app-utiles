.class public final Lfv0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/util/Collection;

.field public final f:Ljava/io/Serializable;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lav5;[Lav5;)V
    .locals 3

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Lfv0;->a:Ljava/lang/String;

    .line 75
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lfv0;->d:Ljava/lang/Object;

    .line 76
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lfv0;->e:Ljava/util/Collection;

    const/4 v1, 0x0

    .line 77
    iput v1, p0, Lfv0;->b:I

    .line 78
    iput v1, p0, Lfv0;->c:I

    .line 79
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lfv0;->f:Ljava/io/Serializable;

    .line 80
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 81
    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    .line 82
    const-string v2, "Null interface"

    invoke-static {v2, v0}, Lh75;->d(Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 83
    :cond_0
    iget-object p0, p0, Lfv0;->d:Ljava/lang/Object;

    check-cast p0, Ljava/util/HashSet;

    invoke-static {p0, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lfv0;->a:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lfv0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v1, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lfv0;->e:Ljava/util/Collection;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput v1, p0, Lfv0;->b:I

    .line 23
    .line 24
    iput v1, p0, Lfv0;->c:I

    .line 25
    .line 26
    new-instance v2, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, Lfv0;->f:Ljava/io/Serializable;

    .line 32
    .line 33
    invoke-static {p1}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    array-length p1, p2

    .line 41
    :goto_0
    if-ge v1, p1, :cond_0

    .line 42
    .line 43
    aget-object v0, p2, v1

    .line 44
    .line 45
    const-string v2, "Null interface"

    .line 46
    .line 47
    invoke-static {v2, v0}, Lh75;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lfv0;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-static {v0}, Lav5;->a(Ljava/lang/Class;)Lav5;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    return-void
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

.method public constructor <init>([BLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 7

    const/4 v5, -0x1

    const/4 v6, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 72
    invoke-direct/range {v0 .. v6}, Lfv0;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;II)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lfv0;->d:Ljava/lang/Object;

    .line 67
    iput-object p2, p0, Lfv0;->a:Ljava/lang/String;

    .line 68
    iput-object p3, p0, Lfv0;->e:Ljava/util/Collection;

    .line 69
    iput-object p4, p0, Lfv0;->f:Ljava/io/Serializable;

    .line 70
    iput p6, p0, Lfv0;->b:I

    .line 71
    iput p5, p0, Lfv0;->c:I

    return-void
.end method


# virtual methods
.method public a(Lzp1;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lzp1;->a:Lav5;

    .line 2
    .line 3
    iget-object v1, p0, Lfv0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lfv0;->e:Ljava/util/Collection;

    .line 14
    .line 15
    check-cast p0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "Components are not allowed to depend on interfaces they themselves provide."

    .line 22
    .line 23
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public b()Lgv0;
    .locals 9

    .line 1
    iget-object v0, p0, Lfv0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lxv0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v1, Lgv0;

    .line 13
    .line 14
    iget-object v2, p0, Lfv0;->a:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v3, Ljava/util/HashSet;

    .line 17
    .line 18
    iget-object v0, p0, Lfv0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Ljava/util/HashSet;

    .line 26
    .line 27
    iget-object v0, p0, Lfv0;->e:Ljava/util/Collection;

    .line 28
    .line 29
    check-cast v0, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-direct {v4, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    iget v5, p0, Lfv0;->b:I

    .line 35
    .line 36
    iget v6, p0, Lfv0;->c:I

    .line 37
    .line 38
    iget-object v0, p0, Lfv0;->g:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v7, v0

    .line 41
    check-cast v7, Lxv0;

    .line 42
    .line 43
    iget-object p0, p0, Lfv0;->f:Ljava/io/Serializable;

    .line 44
    .line 45
    move-object v8, p0

    .line 46
    check-cast v8, Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-direct/range {v1 .. v8}, Lgv0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILxv0;Ljava/util/Set;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_1
    const-string p0, "Missing required property: factory."

    .line 53
    .line 54
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public c(I)V
    .locals 1

    .line 1
    iget v0, p0, Lfv0;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iput p1, p0, Lfv0;->b:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    const-string p0, "Instantiation type has already been set."

    .line 14
    .line 15
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 16
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
