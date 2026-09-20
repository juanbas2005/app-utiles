.class public final Lyv8;
.super Lf76;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Ljava/util/Set;

.field public static final c:Lwv8;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    sget-object v1, Lyt8;->a:Ldu8;

    .line 4
    .line 5
    sget-object v2, Liu8;->a:Ldu8;

    .line 6
    .line 7
    sget-object v3, Lku8;->a:Ldu8;

    .line 8
    .line 9
    filled-new-array {v1, v2, v3}, [Ldu8;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lyv8;->b:Ljava/util/Set;

    .line 25
    .line 26
    new-instance v1, Lqc3;

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    invoke-direct {v1, v2}, Lqc3;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ldu8;

    .line 47
    .line 48
    iget-object v3, v1, Lqc3;->y:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v4, v1, Lqc3;->x:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Ljava/util/HashMap;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    iget-boolean v5, v2, Ldu8;->c:Z

    .line 59
    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    sget-object v6, Lqc3;->F:Ln63;

    .line 63
    .line 64
    if-eqz v5, :cond_0

    .line 65
    .line 66
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const-string v0, "key must be repeating"

    .line 74
    .line 75
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    sget-object v5, Lqc3;->E:Ltz2;

    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    const-string v0, " must not be null"

    .line 89
    .line 90
    const-string v1, "key"

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lku4;->j(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    new-instance v0, Lor2;

    .line 101
    .line 102
    invoke-direct {v0, v1}, Lor2;-><init>(Lqc3;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lwv8;

    .line 106
    .line 107
    sget-object v2, Lyv8;->b:Ljava/util/Set;

    .line 108
    .line 109
    sget-object v3, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    .line 110
    .line 111
    invoke-direct {v1, v3, v2, v0}, Lwv8;-><init>(Ljava/util/logging/Level;Ljava/util/Set;Lor2;)V

    .line 112
    .line 113
    .line 114
    sput-object v1, Lyv8;->c:Lwv8;

    .line 115
    .line 116
    return-void
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
