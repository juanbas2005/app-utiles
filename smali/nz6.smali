.class public abstract Lnz6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ljava/util/LinkedHashSet;

.field public static final b:Lgq0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Lnn3;->a:Lup2;

    .line 2
    .line 3
    sget-object v1, Lnn3;->h:Lup2;

    .line 4
    .line 5
    sget-object v2, Lnn3;->i:Lup2;

    .line 6
    .line 7
    sget-object v3, Lnn3;->c:Lup2;

    .line 8
    .line 9
    sget-object v4, Lnn3;->d:Lup2;

    .line 10
    .line 11
    sget-object v5, Lnn3;->f:Lup2;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lup2;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lup2;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v3, Lgq0;

    .line 46
    .line 47
    invoke-virtual {v2}, Lup2;->b()Lup2;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v2, v2, Lup2;->a:Lvp2;

    .line 52
    .line 53
    invoke-virtual {v2}, Lvp2;->g()Luq4;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-direct {v3, v4, v2}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sput-object v1, Lnz6;->a:Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    sget-object v0, Lnn3;->g:Lup2;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v1, Lgq0;

    .line 72
    .line 73
    invoke-virtual {v0}, Lup2;->b()Lup2;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    iget-object v0, v0, Lup2;->a:Lvp2;

    .line 78
    .line 79
    invoke-virtual {v0}, Lvp2;->g()Luq4;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {v1, v2, v0}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 84
    .line 85
    .line 86
    sput-object v1, Lnz6;->b:Lgq0;

    .line 87
    .line 88
    return-void
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
