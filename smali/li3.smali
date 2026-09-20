.class public abstract Lli3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ljava/util/Map;

.field public static final b:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    sget-object v0, Ljm;->B:Ljm;

    .line 2
    .line 3
    sget-object v1, Ljm;->A:Ljm;

    .line 4
    .line 5
    sget-object v2, Ljm;->z:Ljm;

    .line 6
    .line 7
    sget-object v3, Ljm;->x:Ljm;

    .line 8
    .line 9
    sget-object v4, Ljm;->y:Ljm;

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljm;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-static {v4}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lon3;->a:Lup2;

    .line 24
    .line 25
    new-instance v5, Lki3;

    .line 26
    .line 27
    new-instance v6, Lxc8;

    .line 28
    .line 29
    sget-object v2, Ls15;->y:Ls15;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v6, v2, v3}, Lxc8;-><init>(Ljava/lang/Object;Z)V

    .line 33
    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    const/4 v10, 0x1

    .line 37
    const/4 v8, 0x0

    .line 38
    invoke-direct/range {v5 .. v10}, Lki3;-><init>(Lxc8;Ljava/util/Collection;ZZZ)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Lyb5;

    .line 42
    .line 43
    invoke-direct {v4, v1, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object v1, Lon3;->b:Lup2;

    .line 47
    .line 48
    new-instance v5, Lki3;

    .line 49
    .line 50
    new-instance v6, Lxc8;

    .line 51
    .line 52
    invoke-direct {v6, v2, v3}, Lxc8;-><init>(Ljava/lang/Object;Z)V

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v5 .. v10}, Lki3;-><init>(Lxc8;Ljava/util/Collection;ZZZ)V

    .line 56
    .line 57
    .line 58
    new-instance v6, Lyb5;

    .line 59
    .line 60
    invoke-direct {v6, v1, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object v1, Lon3;->c:Lup2;

    .line 64
    .line 65
    new-instance v5, Lki3;

    .line 66
    .line 67
    new-instance v8, Lxc8;

    .line 68
    .line 69
    sget-object v9, Ls15;->w:Ls15;

    .line 70
    .line 71
    invoke-direct {v8, v9, v3}, Lxc8;-><init>(Ljava/lang/Object;Z)V

    .line 72
    .line 73
    .line 74
    const/4 v9, 0x4

    .line 75
    invoke-direct {v5, v8, v7, v9}, Lki3;-><init>(Lxc8;Ljava/util/Collection;I)V

    .line 76
    .line 77
    .line 78
    new-instance v7, Lyb5;

    .line 79
    .line 80
    invoke-direct {v7, v1, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    filled-new-array {v4, v6, v7}, [Lyb5;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, Lsf4;->V([Lyb5;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sput-object v1, Lli3;->a:Ljava/util/Map;

    .line 92
    .line 93
    sget-object v4, Lon3;->h:Lup2;

    .line 94
    .line 95
    new-instance v5, Lki3;

    .line 96
    .line 97
    new-instance v6, Lxc8;

    .line 98
    .line 99
    invoke-direct {v6, v2, v3}, Lxc8;-><init>(Ljava/lang/Object;Z)V

    .line 100
    .line 101
    .line 102
    const/16 v2, 0x1c

    .line 103
    .line 104
    invoke-direct {v5, v6, v0, v2}, Lki3;-><init>(Lxc8;Ljava/util/Collection;I)V

    .line 105
    .line 106
    .line 107
    new-instance v6, Lyb5;

    .line 108
    .line 109
    invoke-direct {v6, v4, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v4, Lon3;->i:Lup2;

    .line 113
    .line 114
    new-instance v5, Lki3;

    .line 115
    .line 116
    new-instance v7, Lxc8;

    .line 117
    .line 118
    sget-object v8, Ls15;->x:Ls15;

    .line 119
    .line 120
    invoke-direct {v7, v8, v3}, Lxc8;-><init>(Ljava/lang/Object;Z)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v5, v7, v0, v2}, Lki3;-><init>(Lxc8;Ljava/util/Collection;I)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Lyb5;

    .line 127
    .line 128
    invoke-direct {v0, v4, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    filled-new-array {v6, v0}, [Lyb5;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lsf4;->V([Lyb5;)Ljava/util/Map;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v1, v0}, Lsf4;->X(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sput-object v0, Lli3;->b:Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    return-void
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
